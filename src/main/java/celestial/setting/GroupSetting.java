/*
 * Decompiled with CFR 0.152.
 */
package celestial.setting;

import celestial.setting.Setting;
import java.util.ArrayList;
import java.util.List;

public class GroupSetting
extends Setting<List<Setting<?>>> {
    public GroupSetting(String var1, Setting<?> ... var2) {
        super(var1, new ArrayList(List.of(var2)));
    }

    public void id_class(Setting<?> var1) {
        ((List)this.id_byte()).add(var1);
    }

    public void id_class(Setting<?> ... var1) {
        Setting<?>[] var2 = var1;
        int var3 = var1.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            Setting<?> var5 = var2[var4];
            this.id_class(var5);
        }
    }

    @Override
    public boolean id_private() {
        List var1 = (List)this.id_byte();
        return super.id_private() && (var1.isEmpty() || var1.stream().anyMatch(Setting::id_private));
    }
}

