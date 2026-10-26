/*
 * Decompiled with CFR 0.152.
 */
package celestial.setting;

import celestial.rrfC_2;
import java.util.Map;

public class KeyBind {
    public static Object[] staticFields7d889755b225350f87e436adc34ba83e;
    public static final KeyBind NONE;
    public Object[] fields7d889755b225350f87e436adc34ba83e;

    public static KeyBind get(int index) {
        if (staticFields7d889755b225350f87e436adc34ba83e == null) {
            KeyBind.id_catch();
        }
        return (KeyBind)staticFields7d889755b225350f87e436adc34ba83e[index];
    }

    public int id_byte() {
        return (Integer)this.fields7d889755b225350f87e436adc34ba83e[0];
    }

    public KeyBind(int var3, String var4) {
        this.id_implements();
        Integer var9 = var3;
        this.fields7d889755b225350f87e436adc34ba83e[0] = var9;
        this.fields7d889755b225350f87e436adc34ba83e[1] = var4;
        ((Map)rrfC_2.id_class[0]).put(var3, this);
    }

    public boolean id_class() {
        return this == (KeyBind)staticFields7d889755b225350f87e436adc34ba83e[0];
    }

    public String id_break() {
        return (String)this.fields7d889755b225350f87e436adc34ba83e[1];
    }

    private static void id_catch() {
        Object[] var0 = new Object[]{new KeyBind(-1337, "None"), new KeyBind(0, "LButton"), new KeyBind(1, "RButton"), new KeyBind(2, "MButton"), new KeyBind(3, "Button 4"), new KeyBind(4, "Button 5"), new KeyBind(5, "Button 6"), new KeyBind(6, "Button 7"), new KeyBind(7, "Button 8"), new KeyBind(32, "Space"), new KeyBind(39, "Apostrophe"), new KeyBind(44, "Comma"), new KeyBind(45, "Minus"), new KeyBind(46, "Period"), new KeyBind(47, "Slash"), new KeyBind(48, "0"), new KeyBind(49, "1"), new KeyBind(50, "2"), new KeyBind(51, "3"), new KeyBind(52, "4"), new KeyBind(53, "5"), new KeyBind(54, "6"), new KeyBind(55, "7"), new KeyBind(56, "8"), new KeyBind(57, "9"), new KeyBind(59, "Semicolon"), new KeyBind(61, "Equal"), new KeyBind(65, "A"), new KeyBind(66, "B"), new KeyBind(67, "C"), new KeyBind(68, "D"), new KeyBind(69, "E"), new KeyBind(70, "F"), new KeyBind(71, "G"), new KeyBind(72, "H"), new KeyBind(73, "I"), new KeyBind(74, "J"), new KeyBind(75, "K"), new KeyBind(76, "L"), new KeyBind(77, "M"), new KeyBind(78, "N"), new KeyBind(79, "O"), new KeyBind(80, "P"), new KeyBind(81, "Q"), new KeyBind(82, "R"), new KeyBind(83, "S"), new KeyBind(84, "T"), new KeyBind(85, "U"), new KeyBind(86, "V"), new KeyBind(87, "W"), new KeyBind(88, "X"), new KeyBind(89, "Y"), new KeyBind(90, "Z"), new KeyBind(91, "LBracket"), new KeyBind(92, "Backslash"), new KeyBind(93, "RBracket"), new KeyBind(96, "Grave"), new KeyBind(161, "World 1"), new KeyBind(162, "World 2"), new KeyBind(256, "Escape"), new KeyBind(257, "Enter"), new KeyBind(258, "Tab"), new KeyBind(259, "Backspace"), new KeyBind(260, "Insert"), new KeyBind(261, "Delete"), new KeyBind(262, "Right"), new KeyBind(263, "Left"), new KeyBind(264, "Down"), new KeyBind(265, "Up"), new KeyBind(266, "Page Up"), new KeyBind(267, "Page Down"), new KeyBind(268, "Home"), new KeyBind(269, "End"), new KeyBind(280, "CapsLock"), new KeyBind(281, "ScrollLock"), new KeyBind(282, "NumLock"), new KeyBind(283, "PrintScreen"), new KeyBind(284, "Pause"), new KeyBind(290, "F1"), new KeyBind(291, "F2"), new KeyBind(292, "F3"), new KeyBind(293, "F4"), new KeyBind(294, "F5"), new KeyBind(295, "F6"), new KeyBind(296, "F7"), new KeyBind(297, "F8"), new KeyBind(298, "F9"), new KeyBind(299, "F10"), new KeyBind(300, "F11"), new KeyBind(301, "F12"), new KeyBind(302, "F13"), new KeyBind(303, "F14"), new KeyBind(304, "F15"), new KeyBind(305, "F16"), new KeyBind(306, "F17"), new KeyBind(307, "F18"), new KeyBind(308, "F19"), new KeyBind(309, "F20"), new KeyBind(310, "F21"), new KeyBind(311, "F22"), new KeyBind(312, "F23"), new KeyBind(313, "F24"), new KeyBind(314, "F25"), new KeyBind(320, "Num0"), new KeyBind(321, "Num1"), new KeyBind(322, "Num2"), new KeyBind(323, "Num3"), new KeyBind(324, "Num4"), new KeyBind(325, "Num5"), new KeyBind(326, "Num6"), new KeyBind(327, "Num7"), new KeyBind(328, "Num8"), new KeyBind(329, "Num9"), new KeyBind(330, "NumDecimal"), new KeyBind(331, "NumDivide"), new KeyBind(332, "NumMultiply"), new KeyBind(333, "NumSubtract"), new KeyBind(334, "NumAdd"), new KeyBind(335, "NumEnter"), new KeyBind(336, "NumEqual"), new KeyBind(340, "LShift"), new KeyBind(341, "LControl"), new KeyBind(342, "LAlt"), new KeyBind(343, "LSuper"), new KeyBind(344, "RShift"), new KeyBind(345, "RControl"), new KeyBind(346, "RAlt"), new KeyBind(347, "RSuper"), new KeyBind(348, "Menu"), null};
        var0[129] = new KeyBind[]{(KeyBind)var0[0], (KeyBind)var0[1], (KeyBind)var0[2], (KeyBind)var0[3], (KeyBind)var0[4], (KeyBind)var0[5], (KeyBind)var0[6], (KeyBind)var0[7], (KeyBind)var0[8], (KeyBind)var0[9], (KeyBind)var0[10], (KeyBind)var0[11], (KeyBind)var0[12], (KeyBind)var0[13], (KeyBind)var0[14], (KeyBind)var0[15], (KeyBind)var0[16], (KeyBind)var0[17], (KeyBind)var0[18], (KeyBind)var0[19], (KeyBind)var0[20], (KeyBind)var0[21], (KeyBind)var0[22], (KeyBind)var0[23], (KeyBind)var0[24], (KeyBind)var0[25], (KeyBind)var0[26], (KeyBind)var0[27], (KeyBind)var0[28], (KeyBind)var0[29], (KeyBind)var0[30], (KeyBind)var0[31], (KeyBind)var0[32], (KeyBind)var0[33], (KeyBind)var0[34], (KeyBind)var0[35], (KeyBind)var0[36], (KeyBind)var0[37], (KeyBind)var0[38], (KeyBind)var0[39], (KeyBind)var0[40], (KeyBind)var0[41], (KeyBind)var0[42], (KeyBind)var0[43], (KeyBind)var0[44], (KeyBind)var0[45], (KeyBind)var0[46], (KeyBind)var0[47], (KeyBind)var0[48], (KeyBind)var0[49], (KeyBind)var0[50], (KeyBind)var0[51], (KeyBind)var0[52], (KeyBind)var0[53], (KeyBind)var0[54], (KeyBind)var0[55], (KeyBind)var0[56], (KeyBind)var0[57], (KeyBind)var0[58], (KeyBind)var0[59], (KeyBind)var0[60], (KeyBind)var0[61], (KeyBind)var0[62], (KeyBind)var0[63], (KeyBind)var0[64], (KeyBind)var0[65], (KeyBind)var0[66], (KeyBind)var0[67], (KeyBind)var0[68], (KeyBind)var0[69], (KeyBind)var0[70], (KeyBind)var0[71], (KeyBind)var0[72], (KeyBind)var0[73], (KeyBind)var0[74], (KeyBind)var0[75], (KeyBind)var0[76], (KeyBind)var0[77], (KeyBind)var0[78], (KeyBind)var0[79], (KeyBind)var0[80], (KeyBind)var0[81], (KeyBind)var0[82], (KeyBind)var0[83], (KeyBind)var0[84], (KeyBind)var0[85], (KeyBind)var0[86], (KeyBind)var0[87], (KeyBind)var0[88], (KeyBind)var0[89], (KeyBind)var0[90], (KeyBind)var0[91], (KeyBind)var0[92], (KeyBind)var0[93], (KeyBind)var0[94], (KeyBind)var0[95], (KeyBind)var0[96], (KeyBind)var0[97], (KeyBind)var0[98], (KeyBind)var0[99], (KeyBind)var0[100], (KeyBind)var0[101], (KeyBind)var0[102], (KeyBind)var0[103], (KeyBind)var0[104], (KeyBind)var0[105], (KeyBind)var0[106], (KeyBind)var0[107], (KeyBind)var0[108], (KeyBind)var0[109], (KeyBind)var0[110], (KeyBind)var0[111], (KeyBind)var0[112], (KeyBind)var0[113], (KeyBind)var0[114], (KeyBind)var0[115], (KeyBind)var0[116], (KeyBind)var0[117], (KeyBind)var0[118], (KeyBind)var0[119], (KeyBind)var0[120], (KeyBind)var0[121], (KeyBind)var0[122], (KeyBind)var0[123], (KeyBind)var0[124], (KeyBind)var0[125], (KeyBind)var0[126], (KeyBind)var0[127], (KeyBind)var0[128]};
        staticFields7d889755b225350f87e436adc34ba83e = var0;
    }

    private void id_implements() {
        if (this.fields7d889755b225350f87e436adc34ba83e == null) {
            this.fields7d889755b225350f87e436adc34ba83e = new Object[2];
            this.fields7d889755b225350f87e436adc34ba83e[0] = 0;
        }
    }

    public boolean id_protected() {
        return (Integer)this.fields7d889755b225350f87e436adc34ba83e[0] >= ((KeyBind)staticFields7d889755b225350f87e436adc34ba83e[1]).id_byte() && (Integer)this.fields7d889755b225350f87e436adc34ba83e[0] <= ((KeyBind)staticFields7d889755b225350f87e436adc34ba83e[8]).id_byte();
    }

    static {
        NONE = new KeyBind(-1337, "None");
        KeyBind.id_catch();
    }
}

