/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.Qj_1;
import celestial.rVj_1;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rqR_2;
import celestial.rqu_3;
import celestial.vm_3;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ux_3 {
    private final Supplier<String> id_class;
    private final Consumer<String> id_break;
    private final Supplier<String> id_byte;
    private final Consumer<String> id_protected;
    private final Predicate<String> id_throws;
    private int id_case;
    private int id_catch;

    private int id_byte(int n) {
        return rfU_2.id_class(n, 0, this.id_class.get().length());
    }

    public void id_byte(int n, boolean bl) {
        this.id_case = this.id_byte(n);
        this.id_class(bl);
    }

    public static Consumer<String> id_byte(QY qY) {
        return string -> ux_3.id_class(qY, string);
    }

    private String id_byte(String string) {
        if (this.id_catch == this.id_case) {
            return string;
        }
        int n = Math.min(this.id_case, this.id_catch);
        int n2 = Math.max(this.id_case, this.id_catch);
        String string2 = string.substring(0, n) + string.substring(n2);
        this.id_catch = this.id_case = n;
        return string2;
    }

    public void id_byte() {
        this.id_protected.accept(this.id_break(this.id_class.get()));
    }

    private void id_byte(boolean bl) {
        this.id_case = this.id_class.get().length();
        this.id_class(bl);
    }

    public ux_3(Supplier<String> supplier, Consumer<String> consumer, Supplier<String> supplier2, Consumer<String> consumer2, Predicate<String> predicate) {
        this.id_class = supplier;
        this.id_break = consumer;
        this.id_byte = supplier2;
        this.id_protected = consumer2;
        this.id_throws = predicate;
        this.id_throws();
    }

    public void id_class(int n, int n2) {
        int n3 = this.id_class.get().length();
        this.id_case = rfU_2.id_class(n, 0, n3);
        this.id_catch = rfU_2.id_class(n2, 0, n3);
    }

    public static void id_class(QY qY, String string) {
        ((Qj_1)qY.id_class[23]).id_class(string);
    }

    public void id_class() {
        String string = this.id_class.get();
        this.id_protected.accept(this.id_break(string));
        this.id_break.accept(this.id_byte(string));
    }

    public static Supplier<String> id_class(QY qY) {
        return () -> ux_3.id_break(qY);
    }

    public void id_class(String string) {
        this.id_class(this.id_class.get(), string);
    }

    private void id_class(String string, String string2) {
        if (this.id_catch != this.id_case) {
            string = this.id_byte(string);
        }
        this.id_case = rfU_2.id_class(this.id_case, 0, string.length());
        String string3 = new StringBuilder(string).insert(this.id_case, string2).toString();
        if (this.id_throws.test(string3)) {
            this.id_break.accept(string3);
            this.id_catch = this.id_case = Math.min(string3.length(), this.id_case + string2.length());
        }
    }

    public boolean id_class(int n) {
        if (vm_3.id_private(n)) {
            this.id_protected();
            return true;
        }
        if (vm_3.id_catch(n)) {
            this.id_byte();
            return true;
        }
        if (vm_3.id_case(n)) {
            this.id_break();
            return true;
        }
        if (vm_3.id_throws(n)) {
            this.id_class();
            return true;
        }
        if (n == 259) {
            this.id_break(-1);
            return true;
        }
        if (n == 261) {
            this.id_break(1);
        } else {
            if (n == 263) {
                if (vm_3.id_else()) {
                    this.id_break(-1, vm_3.id_synchronized());
                } else {
                    this.id_class(-1, vm_3.id_synchronized());
                }
                return true;
            }
            if (n == 262) {
                if (vm_3.id_else()) {
                    this.id_break(1, vm_3.id_synchronized());
                } else {
                    this.id_class(1, vm_3.id_synchronized());
                }
                return true;
            }
            if (n == 268) {
                this.id_break(vm_3.id_synchronized());
                return true;
            }
            if (n == 269) {
                this.id_byte(vm_3.id_synchronized());
                return true;
            }
        }
        return false;
    }

    public boolean id_class(char c) {
        if (rqu_3.id_class(c)) {
            this.id_class(this.id_class.get(), Character.toString(c));
        }
        return true;
    }

    private void id_class(boolean bl) {
        if (!bl) {
            this.id_catch = this.id_case;
        }
    }

    public void id_class(int n, boolean bl) {
        this.id_case = rqR_2.id_class(this.id_class.get(), this.id_case, n);
        this.id_class(bl);
    }

    private void id_break(boolean bl) {
        this.id_case = 0;
        this.id_class(bl);
    }

    public void id_break() {
        this.id_class(this.id_class.get(), this.id_byte.get());
        this.id_catch = this.id_case;
    }

    public void id_break(int n) {
        String string = this.id_class.get();
        if (!string.isEmpty()) {
            String string2;
            if (this.id_catch != this.id_case) {
                string2 = this.id_byte(string);
            } else {
                int n2 = rqR_2.id_class(string, this.id_case, n);
                int n3 = Math.min(n2, this.id_case);
                int n4 = Math.max(n2, this.id_case);
                string2 = new StringBuilder(string).delete(n3, n4).toString();
                if (n < 0) {
                    this.id_catch = this.id_case = n3;
                }
            }
            this.id_break.accept(string2);
        }
    }

    public void id_break(int n, boolean bl) {
        this.id_case = rVj_1.id_class(this.id_class.get(), n, this.id_case, true);
        this.id_class(bl);
    }

    public static String id_break(QY qY) {
        return rgF_2.id_class(((Qj_1)qY.id_class[23]).id_class().replaceAll("\\r", ""));
    }

    private String id_break(String string) {
        int n = Math.min(this.id_case, this.id_catch);
        int n2 = Math.max(this.id_case, this.id_catch);
        return string.substring(n, n2);
    }

    public void id_throws() {
        this.id_byte(false);
    }

    public int id_catch() {
        return this.id_catch;
    }

    public int id_case() {
        return this.id_case;
    }

    public void id_protected() {
        this.id_catch = 0;
        this.id_case = this.id_class.get().length();
    }

    public boolean id_private() {
        return this.id_case != this.id_catch;
    }
}

