/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.combat;

import celestial.an_3;
import celestial.cG_2;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rfo_3;
import celestial.rrAW;
import celestial.rrZW;

public class FriendProtect
extends Module {
    private static short[] id_protected = new short[2];

    public FriendProtect() {
        super("Friend Protect", "\u041e\u0442\u043c\u0435\u043d\u044f\u0435\u0442 \u0443\u0440\u043e\u043d \u043f\u043e \u0434\u0440\u0443\u0437\u044c\u044f\u043c", Category.COMBAT);
    }

    @EventTarget(id_class=-200)
    public void id_class(rrAW var1) {
        cG_2 var4;
        an_3 an_32;
        rfo_3 var2 = var1.id_class();
        if (var2 != null && (an_32 = var2.id_class()) instanceof cG_2 && ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_protected[1]]).id_class(var4 = (cG_2)an_32)) {
            var1.id_class(true);
        }
    }

    private static void id_continue() {
        id_protected = new short[2];
    }
}

