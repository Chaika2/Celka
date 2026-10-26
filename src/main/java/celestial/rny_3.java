/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.function.Supplier;
import javax.management.MBeanAttributeInfo;

public final class rny_3 {
    public final String id_class;
    public final Supplier<Object> id_break;
    private final String id_byte;
    private final Class<?> id_protected;

    public rny_3(String string, Supplier<Object> supplier, String string2, Class<?> clazz) {
        this.id_class = string;
        this.id_break = supplier;
        this.id_byte = string2;
        this.id_protected = clazz;
    }

    public MBeanAttributeInfo id_class() {
        return new MBeanAttributeInfo(this.id_class, this.id_protected.getSimpleName(), this.id_byte, true, false, false);
    }
}

