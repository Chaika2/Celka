/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface C_finally {
    public String id_class();

    public String id_break();
}

