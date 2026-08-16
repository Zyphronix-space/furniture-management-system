package furniture.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Theme {

    public static final Color BG = new Color(0xF4F5FA);
    public static final Color CARD = Color.WHITE;
    public static final Color SIDEBAR = new Color(0x1F2340);
    public static final Color PRIMARY = new Color(0x6C63FF);
    public static final Color PRIMARY_DARK = new Color(0x554EE0);
    public static final Color TEXT_DARK = new Color(0x1F2937);
    public static final Color TEXT_MUTED = new Color(0x8A8FA3);
    public static final Color BORDER = new Color(0xE5E7F0);
    public static final Color DANGER = new Color(0xF25C66);

    public static final Font FONT_TITLE = new Font("Segoe UI Semibold", Font.PLAIN, 28);
    public static final Font FONT_HEADING = new Font("Segoe UI Semibold", Font.PLAIN, 18);
    public static final Font FONT_LABEL = new Font("Segoe UI Semibold", Font.PLAIN, 13);
    public static final Font FONT_BODY = new Font("Segoe UI", Font.PLAIN, 14);
    public static final Font FONT_BUTTON = new Font("Segoe UI Semibold", Font.PLAIN, 14);

    public static void primaryButton(JButton b) {
        b.setBackground(PRIMARY);
        b.setForeground(Color.WHITE);
        b.setFont(FONT_BUTTON);
        b.setFocusPainted(false);
        b.setBorder(new EmptyBorder(10, 22, 10, 22));
        b.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
    }

    public static void secondaryButton(JButton b) {
        b.setBackground(Color.WHITE);
        b.setForeground(TEXT_DARK);
        b.setFont(FONT_BUTTON);
        b.setFocusPainted(false);
        b.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createLineBorder(BORDER, 1, true),
                new EmptyBorder(9, 20, 9, 20)));
        b.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
    }

    public static void dangerButton(JButton b) {
        b.setBackground(DANGER);
        b.setForeground(Color.WHITE);
        b.setFont(FONT_BUTTON);
        b.setFocusPainted(false);
        b.setBorder(new EmptyBorder(10, 22, 10, 22));
        b.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
    }

    public static void navButton(JButton b) {
        b.setBackground(SIDEBAR);
        b.setForeground(new Color(0xC9CBE0));
        b.setFont(FONT_BODY);
        b.setFocusPainted(false);
        b.setHorizontalAlignment(SwingConstants.LEFT);
        b.setBorder(new EmptyBorder(12, 18, 12, 18));
        b.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
    }
}
