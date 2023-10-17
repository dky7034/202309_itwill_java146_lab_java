package com.itwill.swing06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain06 {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain06 window = new AppMain06();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public AppMain06() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JButton btnMsgDlg = new JButton("Message Dialog");
        btnMsgDlg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 메시지 다이얼로그 보여주기
//                JOptionPane.showMessageDialog(frame, "안녕하세요.");
                JOptionPane.showMessageDialog(
                        frame,  // 메시지 다이얼로그가 실행될 부모 컴포넌트 
                        "Hello, Swing!", // 다이얼로그에 표시될 메시지 
                        "메시지", // 다이얼로그의 타이틀 
                        JOptionPane.INFORMATION_MESSAGE // 메시지 타입
                        );
            }
        });
        btnMsgDlg.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnMsgDlg.setBounds(12, 10, 410, 64);
        frame.getContentPane().add(btnMsgDlg);
        
        final JButton btnConfirmDlg = new JButton("Confirm Dialog");
        btnConfirmDlg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Confirm(확인) 다이얼로그 보여주기
//                int result = JOptionPane.showConfirmDialog(frame, "식사하셨나요?");
                int result = JOptionPane.showConfirmDialog(
                        frame, // 부모 컴포넌트 
                        "정말 삭제할까요?", // 메시지 
                        "삭제 확인", // 타이틀 
                        JOptionPane.YES_NO_OPTION, // 옵션 타입(버튼 종류, 개수)
                        JOptionPane.QUESTION_MESSAGE // 메시지 타입
                        );
                
                btnConfirmDlg.setText("confirm = " + result);
            }
        });
        btnConfirmDlg.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnConfirmDlg.setBounds(12, 84, 410, 64);
        frame.getContentPane().add(btnConfirmDlg);
    }

}
