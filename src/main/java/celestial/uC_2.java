/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.QY;
import celestial.rAF;
import celestial.rAL;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.uc_3;
import celestial.un_3;
import celestial.uu_3;
import com.google.gson.JsonObject;
import java.io.IOException;

public class uC_2
implements uu_3 {
    private final rqO_2 id_class;
    private final String id_break;

    public uC_2(rqO_2 rqO_22, String string) {
        this.id_class = rqO_22;
        this.id_break = string;
    }

    public static uu_3 id_class(JsonObject jsonObject) {
        return new uC_2(new rqO_2(rpY_2.id_case(jsonObject, "sizes")), rpY_2.id_case(jsonObject, "template"));
    }

    @Override
    public uc_3 id_class(rAL rAL2) {
        un_3 un_32;
        block8: {
            rAF rAF2 = QY.id_instanceof().F().id_class(this.id_class);
            try {
                byte[] byArray = new byte[65536];
                rAF2.id_break().read(byArray);
                un_32 = new un_3(rAL2, byArray, this.id_break);
                if (rAF2 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (rAF2 != null) {
                        try {
                            rAF2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    un_3.id_class.error("Cannot load {}, unicode glyphs will not render correctly", (Object)this.id_class);
                    return null;
                }
            }
            rAF2.close();
        }
        return un_32;
    }
}

