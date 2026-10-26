/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
package celestial;

import celestial.Ml_1;
import celestial.jI_2;
import celestial.mT_2;
import celestial.rgN_2;
import celestial.rrJh_1;
import celestial.rrba_3;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrkx_1;
import celestial.rrxi_3;
import celestial.rrzM_2;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class rrkW
extends rrJh_1 {
    private ArrayList id_synchronized;
    private int id_return;
    private long id_public = Long.MIN_VALUE;
    private long id_goto = 0L;
    public final rrkx_1 id_else;

    @Override
    public int id_int() {
        return this.id_protected() * 18;
    }

    public rrkW(rrkx_1 rrkx_12, int n, int n2, int n3, int n4, int n5) {
        super(rrkx_12.id_native(), n, n2, n3, n4, n5);
        this.id_else = rrkx_12;
        this.id_new();
        this.id_int = 0.0;
        int n6 = this.id_return * n5;
        int n7 = (n4 - n3) / 2;
        if (n6 > n7) {
            this.id_protected(n6 - n7);
        }
    }

    private boolean id_class(rrxi_3 rrxi_32, int n) {
        if (rrxi_32 == null) {
            return true;
        }
        InputStream inputStream = rrxi_32.id_class("/shaders/shaders.properties");
        Properties properties = rrzM_2.id_class(inputStream, "Shaders");
        if (properties == null) {
            return true;
        }
        String string = "version.1.16.5";
        String string2 = properties.getProperty(string);
        if (string2 == null) {
            return true;
        }
        String string3 = "G8";
        int n2 = rrbb_3.id_break(string3, string2 = string2.trim());
        if (n2 >= 0) {
            return true;
        }
        String string4 = ("HD_U_" + string2).replace('_', ' ');
        String string5 = jI_2.id_class("of.message.shaders.nv1", string4, new Object[0]);
        String string6 = jI_2.id_class("of.message.shaders.nv2", new Object[0]);
        BooleanConsumer booleanConsumer = bl -> {
            if (bl) {
                this.id_catch(n);
            }
            this.id_case.id_break(this.id_else);
        };
        mT_2 mT_22 = new mT_2(booleanConsumer, new rgN_2(string5), new rgN_2(string6));
        this.id_case.id_break(mT_22);
        return false;
    }

    @Override
    public boolean id_class(double d, double d2, double d3) {
        return super.id_class(d, d2, d3 * 3.0);
    }

    @Override
    protected void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, float f) {
        String string = (String)this.id_synchronized.get(n);
        if (string.equals("OFF")) {
            string = rrba_3.id_class("of.options.shaders.packNone");
        } else if (string.equals("(internal)")) {
            string = rrba_3.id_class("of.options.shaders.packDefault");
        }
        this.id_else.id_class(ml_1, string, this.id_catch / 2, n3 + 1, 0xE0E0E0);
    }

    @Override
    protected boolean id_class(int n, int n2, double d, double d2) {
        if (n == this.id_return && this.id_public == this.id_goto) {
            return false;
        }
        String string = (String)this.id_synchronized.get(n);
        rrxi_3 rrxi_32 = rrdZ.id_break(string);
        if (!this.id_class(rrxi_32, n)) {
            return false;
        }
        this.id_catch(n);
        return true;
    }

    @Override
    protected boolean id_break(int n) {
        return n == this.id_return;
    }

    private void id_catch(int n) {
        this.id_return = n;
        this.id_goto = this.id_public;
        rrdZ.id_class((String)this.id_synchronized.get(n));
        rrdZ.id_while();
        this.id_else.id_finally();
    }

    public int id_continue() {
        return this.id_return;
    }

    public void id_new() {
        this.id_synchronized = rrdZ.id_catch();
        this.id_return = 0;
        int n = this.id_synchronized.size();
        for (int i = 0; i < n; ++i) {
            if (!((String)this.id_synchronized.get(i)).equals(rrdZ.sP)) continue;
            this.id_return = i;
            break;
        }
    }

    @Override
    protected int id_package() {
        return this.id_catch - 6;
    }

    @Override
    protected int id_protected() {
        return this.id_synchronized.size();
    }

    @Override
    protected void id_private() {
    }

    @Override
    public int id_volatile() {
        return this.id_catch - 20;
    }
}

