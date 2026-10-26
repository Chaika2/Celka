/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFWVidMode
 *  org.lwjgl.glfw.GLFWVidMode$Buffer
 */
package celestial;

import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.lwjgl.glfw.GLFWVidMode;

public final class yM_2 {
    private final int id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private final int id_throws;
    private final int id_case;
    private static final Pattern id_catch = Pattern.compile("(\\d+)x(\\d+)(?:@(\\d+)(?::(\\d+))?)?");

    public int id_byte() {
        return this.id_byte;
    }

    public yM_2(int n, int n2, int n3, int n4, int n5, int n6) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = n4;
        this.id_throws = n5;
        this.id_case = n6;
    }

    public yM_2(GLFWVidMode gLFWVidMode) {
        this.id_class = gLFWVidMode.width();
        this.id_break = gLFWVidMode.height();
        this.id_byte = gLFWVidMode.redBits();
        this.id_protected = gLFWVidMode.greenBits();
        this.id_throws = gLFWVidMode.blueBits();
        this.id_case = gLFWVidMode.refreshRate();
    }

    public yM_2(GLFWVidMode.Buffer buffer) {
        this.id_class = buffer.width();
        this.id_break = buffer.height();
        this.id_byte = buffer.redBits();
        this.id_protected = buffer.greenBits();
        this.id_throws = buffer.blueBits();
        this.id_case = buffer.refreshRate();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            yM_2 yM_22 = (yM_2)object;
            return this.id_class == yM_22.id_class && this.id_break == yM_22.id_break && this.id_byte == yM_22.id_byte && this.id_protected == yM_22.id_protected && this.id_throws == yM_22.id_throws && this.id_case == yM_22.id_case;
        }
        return false;
    }

    public String toString() {
        return String.format("%sx%s@%s (%sbit)", this.id_class, this.id_break, this.id_case, this.id_byte + this.id_protected + this.id_throws);
    }

    public int hashCode() {
        return Objects.hash(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case);
    }

    public int id_class() {
        return this.id_class;
    }

    public static Optional<yM_2> id_class(String string) {
        if (string == null) {
            return Optional.empty();
        }
        try {
            Matcher matcher = id_catch.matcher(string);
            if (matcher.matches()) {
                int n = Integer.parseInt(matcher.group(1));
                int n2 = Integer.parseInt(matcher.group(2));
                String string2 = matcher.group(3);
                int n3 = string2 == null ? 60 : Integer.parseInt(string2);
                String string3 = matcher.group(4);
                int n4 = string3 == null ? 24 : Integer.parseInt(string3);
                int n5 = n4 / 3;
                return Optional.of(new yM_2(n, n2, n5, n5, n5, n3));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return Optional.empty();
    }

    public int id_break() {
        return this.id_break;
    }

    public int id_throws() {
        return this.id_throws;
    }

    public String id_catch() {
        return String.format("%sx%s@%s:%s", this.id_class, this.id_break, this.id_case, this.id_byte + this.id_protected + this.id_throws);
    }

    public int id_case() {
        return this.id_case;
    }

    public int id_protected() {
        return this.id_protected;
    }
}

