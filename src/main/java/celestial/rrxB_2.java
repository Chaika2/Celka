/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJi_1;
import celestial.rrMP;
import celestial.rrxG_2;
import celestial.rrxM_2;
import celestial.rrxS_2;
import celestial.rrxs_3;

public class rrxB_2
implements rrJi_1 {
    private String id_class = null;
    private boolean id_break = false;
    private Class id_byte = null;

    public boolean id_byte() {
        return this.id_break() != null;
    }

    public rrxB_2(String string) {
        this.id_class = string;
        rrxM_2.id_class(this);
    }

    public rrxB_2(Class clazz) {
        this.id_byte = clazz;
        this.id_class = clazz.getName();
        this.id_break = true;
    }

    public rrxs_3 id_class(String string) {
        return new rrxs_3(this, string);
    }

    public rrxG_2 id_class(String string, Class[] classArray) {
        return new rrxG_2(this, string, classArray);
    }

    public rrxS_2 id_class(Class[] classArray) {
        return new rrxS_2(this, classArray);
    }

    @Override
    public void id_class() {
        Class clazz = this.id_break();
    }

    public boolean id_class(Object object) {
        return this.id_break() == null ? false : this.id_break().isInstance(object);
    }

    public Class id_break() {
        if (this.id_break) {
            return this.id_byte;
        }
        this.id_break = true;
        try {
            this.id_byte = Class.forName(this.id_class);
        }
        catch (ClassNotFoundException classNotFoundException) {
            rrMP.id_throws("(Reflector) Class not present: " + this.id_class);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return this.id_byte;
    }

    public rrxG_2 id_break(String string) {
        return new rrxG_2(this, string);
    }

    public String id_protected() {
        return this.id_class;
    }
}

