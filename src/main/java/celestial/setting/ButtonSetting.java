/*
 * Decompiled with CFR 0.152.
 */
package celestial.setting;

import celestial.module.Module;
import celestial.setting.Setting;

public class ButtonSetting
extends Setting<Runnable> {
    public Object[] id_break;

    public ButtonSetting(Module var1, String var2, Runnable var3) {
        super(var2, var3);
        this.id_native();
        this.id_break[0] = var1;
        this.id_break[1] = var3;
    }

    public Module id_class() {
        this.id_native();
        return (Module)this.id_break[0];
    }

    public Runnable id_break() {
        this.id_native();
        return (Runnable)this.id_break[1];
    }

    private void id_native() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[2];
        }
    }
}

