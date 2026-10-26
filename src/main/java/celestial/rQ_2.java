/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.rfH_2;
import celestial.rja_3;
import celestial.rq_3;
import celestial.rz_3;
import celestial.xc_3;
import java.io.File;
import java.util.List;

public interface rQ_2
extends rz_3 {
    public void id_class(int var1);

    default public boolean id_class(String string, rfH_2 rfH_22) {
        File file = new File(new File((File)QY.id_instanceof().id_class[24], "schematics"), string);
        return this.id_class(string, file, (rja_3)rfH_22);
    }

    public void id_class(rfH_2 var1, rfH_2 var2);

    public boolean id_class(String var1, File var2, rja_3 var3);

    public void id_class(String var1, rq_3 var2, rja_3 var3);

    public void id_finally();

    public void id_extends();

    public List<xc_3> id_implements();

    public void id_private();

    public boolean id_native();
}

