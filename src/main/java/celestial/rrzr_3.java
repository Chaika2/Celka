/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrbb_3;
import java.lang.reflect.Method;
import java.util.function.LongSupplier;

public class rrzr_3
implements LongSupplier {
    private boolean id_byte = false;
    public final /* synthetic */ Method id_class;
    public final /* synthetic */ Object id_break;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rrzr_3(Method method, Object object) {
        this.id_class = method;
        this.id_break = object;
    }

    @Override
    public long getAsLong() {
        if (this.id_byte) {
            return -1L;
        }
        try {
            return (Long)this.id_class.invoke(this.id_break, new Object[0]);
        }
        catch (Throwable throwable) {
            rrbb_3.id_protected("(Reflector) " + throwable.getClass().getName() + ": " + throwable.getMessage());
            this.id_byte = true;
            return -1L;
        }
    }
}

