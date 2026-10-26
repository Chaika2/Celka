/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.YJ;
import celestial.gy_3;
import celestial.rVi_1;
import celestial.rcd_3;
import celestial.rgZ_2;
import celestial.rgx_3;
import celestial.rqO_2;
import java.util.Objects;
import java.util.stream.Stream;

public class rgW_2
extends rgx_3 {
    private final rqO_2 id_catch;

    public rgW_2(String string, boolean bl, rqO_2 rqO_22) {
        super(string, bl);
        this.id_catch = rqO_22;
    }

    public rgW_2(String string, YJ yJ, boolean bl, rqO_2 rqO_22) {
        super(string, yJ, bl);
        this.id_catch = rqO_22;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rgW_2)) {
            return false;
        }
        rgW_2 rgW_22 = (rgW_2)object;
        return Objects.equals(this.id_catch, rgW_22.id_catch) && Objects.equals(this.id_protected, rgW_22.id_protected) && super.equals(object);
    }

    @Override
    public String toString() {
        return "StorageNbtComponent{id='" + this.id_catch + "'path='" + this.id_protected + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
    }

    @Override
    protected Stream<rcd_3> id_class(gy_3 gy_32) {
        rcd_3 rcd_32 = gy_32.id_super().Y().id_class(this.id_catch);
        return Stream.of(rcd_32);
    }

    @Override
    public /* synthetic */ rVi_1 id_throws() {
        return this.id_native();
    }

    @Override
    public /* synthetic */ rgZ_2 id_finally() {
        return this.id_native();
    }

    public rqO_2 id_extends() {
        return this.id_catch;
    }

    public rgW_2 id_native() {
        return new rgW_2(this.id_protected, this.id_throws, this.id_byte, this.id_catch);
    }
}

