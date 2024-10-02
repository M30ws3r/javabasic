import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCartGUI {
    private JList<String> cartList; // 카트 리스트 -> JList
    private DefaultListModel<String> listModel;
    // ShoppingCart 객체 선언
    private ShoppingCart cart;

    // GUI 컴포넌트 선언
    private JFrame frame;
    private JTextField memberIdField;
    private JTextField productIdField;
    private JTextField productNameField;
    private JTextField quantityField;

    // 생성자
    public ShoppingCartGUI() {
        // 초기화
        cart = new ShoppingCart();

        // 프레임 설정
        frame = new JFrame("장바구니");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 상단 입력 필드 패널
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        // 회원ID 필드
        JLabel memberIdLabel = new JLabel("회원ID:");
        inputPanel.add(memberIdLabel);

        memberIdField = new JTextField();
        inputPanel.add(memberIdField);

        // 품목ID 필드
        JLabel productIdLabel = new JLabel("제품ID:");
        inputPanel.add(productIdLabel);

        productIdField = new JTextField();
        inputPanel.add(productIdField);

        // 품목명 필드
        JLabel productNameLabel = new JLabel("제품명:");
        inputPanel.add(productNameLabel);

        productNameField = new JTextField();
        inputPanel.add(productNameField);

        // 수량 필드
        JLabel quantityLabel = new JLabel("수량:");
        inputPanel.add(quantityLabel);

        quantityField = new JTextField();
        inputPanel.add(quantityField);

        frame.add(inputPanel, BorderLayout.NORTH);

        // 버튼 패널
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // 장바구니에 추가 버튼
        JButton addButton = new JButton("장바구니에 추가");
        buttonPanel.add(addButton);
        // 장바구니에서 제거 버튼
        JButton removeButton = new JButton("장바구니에서 제거");
        buttonPanel.add(removeButton);

        frame.add(buttonPanel, BorderLayout.CENTER);

        // 장바구니 표시 영역 (JList 사용)
        listModel = new DefaultListModel<>();
        cartList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(cartList);
        frame.add(scrollPane, BorderLayout.SOUTH);

        // 버튼 동작 설정
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addToCart();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeFromCart();
            }
        });

        // 프레임 보이기
        frame.setVisible(true);
    }

    // 장바구니에 품목 추가
    private void addToCart() {
        try {
            String memberId = memberIdField.getText().trim();
            String productId = productIdField.getText().trim();
            String productName = productNameField.getText().trim();
            int quantity = Integer.parseInt(quantityField.getText().trim()); // 공백 제거 후 숫자 변환

            cart.addItem(memberId, productId, productName, quantity);
            updateCartDisplay();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "수량을 올바르게 입력해주세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
        }
    }

    // 장바구니에서 품목 제거
    private void removeFromCart() {
        try {
            String productId = productIdField.getText().trim();
            int quantity = Integer.parseInt(quantityField.getText().trim()); // 공백 제거 후 숫자 변환

            cart.removeItem(productId, quantity);
            updateCartDisplay();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "수량을 올바르게 입력해주세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
        }
    }

    // 장바구니 정보 업데이트
    private void updateCartDisplay() {
        listModel.clear(); // 기존 항목 지우기
        for (Item item : cart.getItems().values()) {
            listModel.addElement(item.toString()); // 장바구니 항목을 리스트에 추가
        }
    }

    public static void main(String[] args) {
        new ShoppingCartGUI();
    }
}

// ShoppingCart 클래스
class ShoppingCart {
    private Map<String, Item> cartItems;  // 품목ID를 키로 사용하여 품목을 저장

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    // 장바구니에 품목 추가
    public void addItem(String memberId, String productId, String productName, int quantity) {
        if (cartItems.containsKey(productId)) {
            cartItems.get(productId).addQuantity(quantity);
        } else {
            cartItems.put(productId, new Item(memberId, productId, productName, quantity));
        }
    }

    // 장바구니에서 품목 제거
    public void removeItem(String productId, int quantity) {
        if (cartItems.containsKey(productId)) {
            Item item = cartItems.get(productId);
            item.removeQuantity(quantity);
            if (item.getQuantity() <= 0) {
                cartItems.remove(productId);  // 수량이 0 이하이면 품목 삭제
            }
        }
    }

    // 장바구니 항목 반환
    public Map<String, Item> getItems() {
        return cartItems;
    }

    // 장바구니가 비었는지 확인
    public boolean isEmpty() {
        return cartItems.isEmpty();
    }
}

// Item 클래스
class Item {
    private final String memberId;
    private final String productId;
    private final String productName;
    private int quantity;

    public Item(String memberId, String productId, String productName, int quantity) {
        this.memberId = memberId;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }

    public void addQuantity(int amount) {
        this.quantity += amount;
    }

    public void removeQuantity(int amount) {
        this.quantity -= amount;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "회원 아이디: '" + memberId + "', 품번: '" + productId + "', 제품: '" + productName + "', 수량: " + quantity;
    }
}