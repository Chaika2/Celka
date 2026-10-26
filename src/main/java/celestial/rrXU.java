/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrXU
extends Enum<rrXU> {
    public static final /* enum */ rrXU IDENTIFIER = new rrXU("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_:.");
    public static final /* enum */ rrXU NUMBER = new rrXU("0123456789", "0123456789.");
    public static final /* enum */ rrXU OPERATOR = new rrXU("+-*/%!&|<>=", "&|=");
    public static final /* enum */ rrXU COMMA = new rrXU(",");
    public static final /* enum */ rrXU BRACKET_OPEN = new rrXU("(");
    public static final /* enum */ rrXU BRACKET_CLOSE = new rrXU(")");
    private String charsFirst;
    private String charsNext;
    public static final rrXU[] VALUES;
    private static final /* synthetic */ rrXU[] $VALUES;

    private static /* synthetic */ rrXU[] id_byte() {
        return new rrXU[]{IDENTIFIER, NUMBER, OPERATOR, COMMA, BRACKET_OPEN, BRACKET_CLOSE};
    }

    private rrXU(String string2) {
        this(string2, "");
    }

    private rrXU(String string2, String string3) {
        this.charsFirst = string2;
        this.charsNext = string3;
    }

    static {
        $VALUES = rrXU.id_byte();
        VALUES = rrXU.values();
    }

    public static rrXU[] values() {
        return (rrXU[])$VALUES.clone();
    }

    public static rrXU valueOf(String string) {
        return Enum.valueOf(rrXU.class, string);
    }

    public String id_class() {
        return this.charsFirst;
    }

    public static rrXU id_class(char c) {
        for (int i = 0; i < VALUES.length; ++i) {
            rrXU rrXU2 = VALUES[i];
            if (rrXU2.id_class().indexOf(c) < 0) continue;
            return rrXU2;
        }
        return null;
    }

    public String id_break() {
        return this.charsNext;
    }

    public boolean id_break(char c) {
        return this.charsNext.indexOf(c) >= 0;
    }
}

