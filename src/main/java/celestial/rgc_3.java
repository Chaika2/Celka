/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVa_1;
import celestial.rgF_2;
import celestial.rgl_3;
import celestial.rgy_3;
import celestial.rqO_2;
import java.util.Objects;

public class rgc_3 {
    public static final rgc_3 id_class = new rgc_3(null, null, null, null, null, null, null, null, null, null);
    public static final rqO_2 id_break = new rqO_2("minecraft", "default");
    public final rVa_1 id_byte;
    public final Boolean id_protected;
    public final Boolean id_throws;
    public final Boolean id_case;
    public final Boolean id_catch;
    public final Boolean id_private;
    public final rgl_3 id_implements;
    public final rgy_3 id_finally;
    public final String id_extends;
    public final rqO_2 id_native;

    public rgc_3 id_byte(Boolean bl) {
        return new rgc_3(this.id_byte, this.id_protected, this.id_throws, bl, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native);
    }

    public rgc_3 id_byte(rgF_2 rgF_22) {
        rVa_1 rVa_12 = this.id_byte;
        Boolean bl = this.id_protected;
        Boolean bl2 = this.id_throws;
        Boolean bl3 = this.id_catch;
        Boolean bl4 = this.id_case;
        Boolean bl5 = this.id_private;
        switch (rgF_22) {
            case OBFUSCATED: {
                bl5 = true;
                break;
            }
            case BOLD: {
                bl = true;
                break;
            }
            case STRIKETHROUGH: {
                bl3 = true;
                break;
            }
            case UNDERLINE: {
                bl4 = true;
                break;
            }
            case ITALIC: {
                bl2 = true;
                break;
            }
            case RESET: {
                return id_class;
            }
            default: {
                bl5 = false;
                bl = false;
                bl3 = false;
                bl4 = false;
                bl2 = false;
                rVa_12 = rVa_1.id_class(rgF_22);
            }
        }
        return new rgc_3(rVa_12, bl, bl2, bl4, bl3, bl5, this.id_implements, this.id_finally, this.id_extends, this.id_native);
    }

    public boolean id_byte() {
        return this.id_throws == Boolean.TRUE;
    }

    public rgc_3(rVa_1 rVa_12, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, rgl_3 rgl_32, rgy_3 rgy_32, String string, rqO_2 rqO_22) {
        this.id_byte = rVa_12;
        this.id_protected = bl;
        this.id_throws = bl2;
        this.id_case = bl3;
        this.id_catch = bl4;
        this.id_private = bl5;
        this.id_implements = rgl_32;
        this.id_finally = rgy_32;
        this.id_extends = string;
        this.id_native = rqO_22;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rgc_3)) {
            return false;
        }
        rgc_3 rgc_32 = (rgc_3)object;
        return this.id_break() == rgc_32.id_break() && Objects.equals(this.id_class(), rgc_32.id_class()) && this.id_byte() == rgc_32.id_byte() && this.id_case() == rgc_32.id_case() && this.id_protected() == rgc_32.id_protected() && this.id_throws() == rgc_32.id_throws() && Objects.equals(this.id_private(), rgc_32.id_private()) && Objects.equals(this.id_implements(), rgc_32.id_implements()) && Objects.equals(this.id_finally(), rgc_32.id_finally()) && Objects.equals(this.id_extends(), rgc_32.id_extends());
    }

    public String toString() {
        return "Style{ color=" + this.id_byte + ", bold=" + this.id_protected + ", italic=" + this.id_throws + ", underlined=" + this.id_case + ", strikethrough=" + this.id_catch + ", obfuscated=" + this.id_private + ", clickEvent=" + this.id_private() + ", hoverEvent=" + this.id_implements() + ", insertion=" + this.id_finally() + ", font=" + this.id_extends() + "}";
    }

    public int hashCode() {
        return Objects.hash(this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends);
    }

    public rgc_3 id_class(rqO_2 rqO_22) {
        return new rgc_3(this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, rqO_22);
    }

    public rgc_3 id_class(String string) {
        return new rgc_3(this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_finally, string, this.id_native);
    }

    public rgc_3 id_class(rgy_3 rgy_32) {
        return new rgc_3(this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, rgy_32, this.id_extends, this.id_native);
    }

    public rgc_3 id_class(Boolean bl) {
        return new rgc_3(this.id_byte, bl, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native);
    }

    public rVa_1 id_class() {
        return this.id_byte;
    }

    public rgc_3 id_class(rgF_2 ... rgF_2Array) {
        rVa_1 rVa_12 = this.id_byte;
        Boolean bl = this.id_protected;
        Boolean bl2 = this.id_throws;
        Boolean bl3 = this.id_catch;
        Boolean bl4 = this.id_case;
        Boolean bl5 = this.id_private;
        block8: for (rgF_2 rgF_22 : rgF_2Array) {
            switch (rgF_22) {
                case OBFUSCATED: {
                    bl5 = true;
                    continue block8;
                }
                case BOLD: {
                    bl = true;
                    continue block8;
                }
                case STRIKETHROUGH: {
                    bl3 = true;
                    continue block8;
                }
                case UNDERLINE: {
                    bl4 = true;
                    continue block8;
                }
                case ITALIC: {
                    bl2 = true;
                    continue block8;
                }
                case RESET: {
                    return id_class;
                }
                default: {
                    rVa_12 = rVa_1.id_class(rgF_22);
                }
            }
        }
        return new rgc_3(rVa_12, bl, bl2, bl4, bl3, bl5, this.id_implements, this.id_finally, this.id_extends, this.id_native);
    }

    public rgc_3 id_class(rgc_3 rgc_32) {
        if (this == id_class) {
            return rgc_32;
        }
        return rgc_32 == id_class ? this : new rgc_3(this.id_byte != null ? this.id_byte : rgc_32.id_byte, this.id_protected != null ? this.id_protected : rgc_32.id_protected, this.id_throws != null ? this.id_throws : rgc_32.id_throws, this.id_case != null ? this.id_case : rgc_32.id_case, this.id_catch != null ? this.id_catch : rgc_32.id_catch, this.id_private != null ? this.id_private : rgc_32.id_private, this.id_implements != null ? this.id_implements : rgc_32.id_implements, this.id_finally != null ? this.id_finally : rgc_32.id_finally, this.id_extends != null ? this.id_extends : rgc_32.id_extends, this.id_native != null ? this.id_native : rgc_32.id_native);
    }

    public rgc_3 id_class(rVa_1 rVa_12) {
        return new rgc_3(rVa_12, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native);
    }

    public rgc_3 id_class(rgl_3 rgl_32) {
        return new rgc_3(this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, rgl_32, this.id_finally, this.id_extends, this.id_native);
    }

    public rgc_3 id_class(rgF_2 rgF_22) {
        return this.id_class(rgF_22 != null ? rVa_1.id_class(rgF_22) : null);
    }

    public rgc_3 id_break(rgF_2 rgF_22) {
        rVa_1 rVa_12 = this.id_byte;
        Boolean bl = this.id_protected;
        Boolean bl2 = this.id_throws;
        Boolean bl3 = this.id_catch;
        Boolean bl4 = this.id_case;
        Boolean bl5 = this.id_private;
        switch (rgF_22) {
            case OBFUSCATED: {
                bl5 = true;
                break;
            }
            case BOLD: {
                bl = true;
                break;
            }
            case STRIKETHROUGH: {
                bl3 = true;
                break;
            }
            case UNDERLINE: {
                bl4 = true;
                break;
            }
            case ITALIC: {
                bl2 = true;
                break;
            }
            case RESET: {
                return id_class;
            }
            default: {
                rVa_12 = rVa_1.id_class(rgF_22);
            }
        }
        return new rgc_3(rVa_12, bl, bl2, bl4, bl3, bl5, this.id_implements, this.id_finally, this.id_extends, this.id_native);
    }

    public rgc_3 id_break(Boolean bl) {
        return new rgc_3(this.id_byte, this.id_protected, bl, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native);
    }

    public boolean id_break() {
        return this.id_protected == Boolean.TRUE;
    }

    public boolean id_throws() {
        return this.id_case == Boolean.TRUE;
    }

    public String id_finally() {
        return this.id_extends;
    }

    public boolean id_catch() {
        return this == id_class;
    }

    public rqO_2 id_extends() {
        return this.id_native != null ? this.id_native : id_break;
    }

    public boolean id_case() {
        return this.id_private == Boolean.TRUE;
    }

    public rgy_3 id_implements() {
        return this.id_finally;
    }

    public boolean id_protected() {
        return this.id_catch == Boolean.TRUE;
    }

    public rgl_3 id_private() {
        return this.id_implements;
    }
}

