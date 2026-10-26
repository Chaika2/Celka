/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 */
package celestial;

import celestial.rVL;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rgn_3;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;

public class RY
implements Predicate<rdn_3> {
    private static final Dynamic2CommandExceptionType id_class = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("arguments.item.overstacked", object, object2));
    private final rdb_3 id_break;
    private final rcd_3 id_byte;

    public RY(rdb_3 rdb_32, rcd_3 rcd_32) {
        this.id_break = rdb_32;
        this.id_byte = rcd_32;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rdn_3)object);
    }

    public boolean id_class(rdn_3 rdn_32) {
        return rdn_32.id_break() == this.id_break && rco_3.id_class(this.id_byte, rdn_32.id_package(), true);
    }

    public rdb_3 id_class() {
        return this.id_break;
    }

    public rdn_3 id_class(int n, boolean bl) throws CommandSyntaxException {
        rdn_3 rdn_32 = new rdn_3(this.id_break, n);
        if (this.id_byte != null) {
            rdn_32.id_byte(this.id_byte);
        }
        if (bl && n > rdn_32.id_byte()) {
            throw id_class.create((Object)rVL.id_for.id_break(this.id_break), (Object)rdn_32.id_byte());
        }
        return rdn_32;
    }

    public String id_break() {
        StringBuilder stringBuilder = new StringBuilder(rVL.id_for.id_class(this.id_break));
        if (this.id_byte != null) {
            stringBuilder.append(this.id_byte);
        }
        return stringBuilder.toString();
    }
}

