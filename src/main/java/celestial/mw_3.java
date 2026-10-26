/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Al_1;
import celestial.Qw_1;
import celestial.ZG;
import celestial.cN_2;
import celestial.mt_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rmJ_2;
import celestial.rmu_3;
import celestial.rrFD;
import celestial.rrFK;
import celestial.rud_3;
import celestial.ruv_3;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class mw_3
extends Thread {
    public final /* synthetic */ String id_class;
    public final /* synthetic */ int id_break;
    public final /* synthetic */ mt_3 id_byte;

    public mw_3(mt_3 mt_32, String string, String string2, int n) {
        this.id_byte = mt_32;
        this.id_class = string2;
        this.id_break = n;
        super(string);
    }

    @Override
    public void run() {
        InetAddress inetAddress = null;
        try {
            if (this.id_byte.id_catch) {
                return;
            }
            inetAddress = InetAddress.getByName(this.id_class);
            this.id_byte.id_case = rud_3.id_class(inetAddress, this.id_break, ((Qw_1)this.id_byte.id_volatile.id_class[20]).id_case());
            this.id_byte.id_case.id_class(new Al_1(this.id_byte.id_case, this.id_byte.id_volatile, this.id_byte.id_private, rgP_22 -> this.id_byte.id_break((rgP_2)rgP_22)));
            this.id_byte.id_case.id_class(new rmJ_2(this.id_class, this.id_break, ruv_3.LOGIN));
            this.id_byte.id_case.id_class(new rmu_3(this.id_byte.id_volatile.id_while().id_throws()));
            rrFK.id_class((rrFD)((Object)rrFD.staticFields1658baa549203f63991cdcef51acf497[0]), rgP_2.id_byte(""), this.id_byte.id_case);
        }
        catch (UnknownHostException unknownHostException) {
            if (this.id_byte.id_catch) {
                return;
            }
            mt_3.id_throws.error("Couldn't connect to server", (Throwable)unknownHostException);
            this.id_byte.id_volatile.execute(() -> this.id_byte.id_volatile.id_break(new ZG(this.id_byte.id_private, cN_2.id_implements, new rgn_3("disconnect.genericReason", "Unknown host"))));
        }
        catch (Exception exception) {
            if (this.id_byte.id_catch) {
                return;
            }
            mt_3.id_throws.error("Couldn't connect to server", (Throwable)exception);
            String string = inetAddress == null ? exception.toString() : exception.toString().replaceAll(inetAddress + ":" + this.id_break, "");
            this.id_byte.id_volatile.execute(() -> this.id_byte.id_volatile.id_break(new ZG(this.id_byte.id_private, cN_2.id_implements, new rgn_3("disconnect.genericReason", string))));
        }
    }
}

