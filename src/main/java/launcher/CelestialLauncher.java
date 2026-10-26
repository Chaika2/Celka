package launcher;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 * Standalone Celestial launcher: pick a nickname, press "Запустить" and the
 * client boots in its own JVM (so the launcher window and its log stay
 * available).
 */
public final class CelestialLauncher extends JFrame {
    private static final Pattern NICKNAME = Pattern.compile("[A-Za-z0-9_]{1,16}");
    private static final Path CONFIG = Path.of(
        System.getProperty("user.home", "."), ".celestial-launcher.properties");

    private static final Color BACKGROUND = new Color(0x1E1F24);
    private static final Color PANEL = new Color(0x26272E);
    private static final Color TEXT = new Color(0xE6E6E6);
    private static final Color MUTED = new Color(0x9A9AA5);
    private static final Color ACCENT = new Color(0x7C5CFF);
    private static final Color ACCENT_HOVER = new Color(0x8F74FF);

    private final JTextField nicknameField = new JTextField(18);
    private final JButton launchButton = new JButton("Запустить Celestial");
    private final JLabel statusLabel = new JLabel(" ");
    private final JTextArea logArea = new JTextArea(13, 70);

    private Process process;

    private CelestialLauncher(String initialNickname) {
        super("Celestial Launcher — Beta 1.16.5");
        nicknameField.setText(initialNickname);
        nicknameField.setToolTipText("Ник, под которым клиент заходит на сервер");
        buildUi();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(720, 520));
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] arguments) throws Exception {
        String nickname = savedNickname();
        boolean autoStart = false;
        if (arguments != null) {
            for (int i = 0; i < arguments.length; i++) {
                if ("--autostart".equals(arguments[i])) {
                    autoStart = true;
                } else if ("--username".equals(arguments[i]) && i + 1 < arguments.length) {
                    nickname = arguments[++i];
                } else if (!arguments[i].startsWith("-")) {
                    nickname = arguments[i];
                }
            }
        }
        if (!NICKNAME.matcher(nickname).matches()) {
            nickname = "Player";
        }

        // --autostart: skip the window and boot the game straight away (also
        // used to verify the packaged .exe). Headless environments do the same.
        if (autoStart || GraphicsEnvironment.isHeadless()) {
            int exitCode = runHeadless(nickname);
            System.exit(exitCode);
        }

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
            // default look and feel is fine
        }

        String startName = nickname;
        SwingUtilities.invokeLater(() -> new CelestialLauncher(startName).setVisible(true));
    }

    private static int runHeadless(String nickname) throws InterruptedException {
        try {
            Process process = GameLauncher.start(nickname, System.out::println);
            return process.waitFor();
        } catch (Throwable error) {
            System.err.println("[launcher] Не удалось запустить клиент: " + error);
            error.printStackTrace(System.err);
            return 1;
        }
    }

    private void buildUi() {
        JPanel root = new JPanel(new BorderLayout(0, 14));
        root.setBackground(BACKGROUND);
        root.setBorder(BorderFactory.createEmptyBorder(20, 22, 18, 22));

        root.add(buildHeader(), BorderLayout.NORTH);
        root.add(buildForm(), BorderLayout.CENTER);
        root.add(buildLog(), BorderLayout.SOUTH);

        setContentPane(root);
    }

    private JPanel buildHeader() {
        JPanel header = new JPanel();
        header.setOpaque(false);
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));

        JLabel title = new JLabel("CELESTIAL");
        title.setForeground(TEXT);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 26f));
        title.setAlignmentX(LEFT_ALIGNMENT);

        JLabel subtitle = new JLabel("Лаунчер · Beta 1.16.5 · офлайн-сессия");
        subtitle.setForeground(MUTED);
        subtitle.setFont(subtitle.getFont().deriveFont(Font.PLAIN, 12f));
        subtitle.setAlignmentX(LEFT_ALIGNMENT);

        header.add(title);
        header.add(Box.createVerticalStrut(3));
        header.add(subtitle);
        return header;
    }

    private JPanel buildForm() {
        JPanel form = new JPanel(new GridBagLayout());
        form.setBackground(PANEL);
        form.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(0x35363F)),
            BorderFactory.createEmptyBorder(16, 18, 16, 18)));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0, 0, 8, 10);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridy = 0;

        JLabel nicknameLabel = new JLabel("Ник");
        nicknameLabel.setForeground(TEXT);
        nicknameLabel.setFont(nicknameLabel.getFont().deriveFont(Font.BOLD, 13f));
        constraints.gridx = 0;
        form.add(nicknameLabel, constraints);

        nicknameField.setBackground(new Color(0x1A1B20));
        nicknameField.setForeground(TEXT);
        nicknameField.setCaretColor(TEXT);
        nicknameField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(0x3C3D48)),
            BorderFactory.createEmptyBorder(7, 10, 7, 10)));
        nicknameField.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));
        nicknameField.addActionListener(this::onLaunch);
        constraints.gridx = 1;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        form.add(nicknameField, constraints);

        launchButton.setBackground(ACCENT);
        launchButton.setForeground(Color.WHITE);
        launchButton.setFocusPainted(false);
        launchButton.setBorderPainted(false);
        launchButton.setOpaque(true);
        launchButton.setFont(launchButton.getFont().deriveFont(Font.BOLD, 13f));
        launchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        launchButton.setPreferredSize(new Dimension(190, 36));
        launchButton.addActionListener(this::onLaunch);
        launchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent event) {
                if (launchButton.isEnabled()) {
                    launchButton.setBackground(ACCENT_HOVER);
                }
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent event) {
                launchButton.setBackground(launchButton.isEnabled() ? ACCENT : new Color(0x4A4B57));
            }
        });
        constraints.gridx = 2;
        constraints.weightx = 0;
        constraints.fill = GridBagConstraints.NONE;
        constraints.insets = new Insets(0, 0, 8, 0);
        form.add(launchButton, constraints);

        JLabel hint = new JLabel("1–16 символов: латиница, цифры, подчёркивание. Ник задаёт имя и UUID офлайн-сессии.");
        hint.setForeground(MUTED);
        hint.setFont(hint.getFont().deriveFont(Font.PLAIN, 11f));
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0, 0, 0, 0);
        form.add(hint, constraints);

        JButton openFolder = new JButton("Папка игры");
        openFolder.setBackground(new Color(0x35363F));
        openFolder.setForeground(TEXT);
        openFolder.setFocusPainted(false);
        openFolder.setBorderPainted(false);
        openFolder.setOpaque(true);
        openFolder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        openFolder.addActionListener(event -> openGameFolder());
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        constraints.fill = GridBagConstraints.NONE;
        constraints.insets = new Insets(14, 0, 0, 10);
        form.add(openFolder, constraints);

        statusLabel.setForeground(MUTED);
        statusLabel.setFont(statusLabel.getFont().deriveFont(Font.PLAIN, 12f));
        constraints.gridx = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        form.add(statusLabel, constraints);

        return form;
    }

    private JPanel buildLog() {
        JPanel panel = new JPanel(new BorderLayout(0, 6));
        panel.setOpaque(false);

        JLabel label = new JLabel("Лог клиента");
        label.setForeground(MUTED);
        label.setFont(label.getFont().deriveFont(Font.PLAIN, 11f));
        panel.add(label, BorderLayout.NORTH);

        logArea.setEditable(false);
        logArea.setBackground(new Color(0x141519));
        logArea.setForeground(new Color(0xC9CBD6));
        logArea.setCaretColor(TEXT);
        logArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 11));
        logArea.setBorder(BorderFactory.createEmptyBorder(6, 8, 6, 8));

        JScrollPane scroll = new JScrollPane(logArea);
        scroll.setBorder(BorderFactory.createLineBorder(new Color(0x35363F)));
        scroll.getViewport().setBackground(logArea.getBackground());
        panel.add(scroll, BorderLayout.CENTER);
        return panel;
    }

    private void onLaunch(ActionEvent event) {
        if (process != null && process.isAlive()) {
            return;
        }

        String nickname = nicknameField.getText().trim();
        if (!NICKNAME.matcher(nickname).matches()) {
            setStatus("Ник должен быть 1–16 символов: A-Z, a-z, 0-9, _", true);
            nicknameField.requestFocusInWindow();
            return;
        }

        saveNickname(nickname);
        setBusy(true);
        logArea.setText("");
        setStatus("Запускаю клиент...", false);

        Thread worker = new Thread(() -> {
            try {
                Process started = GameLauncher.start(nickname, this::appendLog);
                process = started;
                appendLog("[launcher] Клиент запущен (PID " + started.pid() + "). Это окно можно свернуть.");
                int exitCode = started.waitFor();
                appendLog("[launcher] Клиент завершился с кодом " + exitCode + ".");
                SwingUtilities.invokeLater(() -> {
                    setBusy(false);
                    setStatus(exitCode == 0 ? "Клиент закрыт." : "Клиент завершился с кодом " + exitCode + ".", exitCode != 0);
                });
            } catch (Throwable error) {
                appendLog("[launcher] Ошибка запуска: " + error);
                SwingUtilities.invokeLater(() -> {
                    setBusy(false);
                    setStatus("Не удалось запустить клиент.", true);
                });
            }
        }, "celestial-launch");
        worker.setDaemon(true);
        worker.start();
    }

    private void setBusy(boolean busy) {
        launchButton.setEnabled(!busy);
        nicknameField.setEnabled(!busy);
        launchButton.setBackground(busy ? new Color(0x4A4B57) : ACCENT);
        launchButton.setCursor(Cursor.getPredefinedCursor(busy ? Cursor.DEFAULT_CURSOR : Cursor.HAND_CURSOR));
    }

    private void setStatus(String text, boolean error) {
        statusLabel.setText(text);
        statusLabel.setForeground(error ? new Color(0xFF6B6B) : MUTED);
    }

    private void appendLog(String line) {
        SwingUtilities.invokeLater(() -> {
            logArea.append(line + System.lineSeparator());
            logArea.setCaretPosition(logArea.getDocument().getLength());
        });
    }

    private void openGameFolder() {
        File dir = GameLauncher.gameDir();
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(dir);
            } else {
                JOptionPane.showMessageDialog(this, dir.getAbsolutePath(), "Папка игры", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException error) {
            JOptionPane.showMessageDialog(this, "Не удалось открыть " + dir + "\n" + error.getMessage(),
                "Папка игры", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static String savedNickname() {
        try {
            if (Files.isRegularFile(CONFIG)) {
                Properties properties = new Properties();
                try (var reader = Files.newBufferedReader(CONFIG, StandardCharsets.UTF_8)) {
                    properties.load(reader);
                }
                String saved = properties.getProperty("username", "").trim();
                if (!saved.isEmpty()) {
                    return saved;
                }
            }
        } catch (IOException ignored) {
            // fall through to the default
        }
        return "Player";
    }

    private static void saveNickname(String nickname) {
        try {
            Properties properties = new Properties();
            properties.setProperty("username", nickname);
            try (var writer = Files.newBufferedWriter(CONFIG, StandardCharsets.UTF_8)) {
                properties.store(writer, "Celestial Launcher");
            }
        } catch (IOException ignored) {
            // remembering the nickname is a convenience only
        }
    }
}
