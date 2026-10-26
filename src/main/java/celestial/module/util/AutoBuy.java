/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.util;

import celestial.Y;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rpu_3;
import celestial.rrIQ;
import celestial.rrLM;
import celestial.rrNh_1;
import celestial.rrTU;
import celestial.rrTo_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.rrtB_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.setting.Setting;
import java.io.File;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import org.apache.commons.lang3.tuple.Pair;

public class AutoBuy
extends Module {
    public Object[] id_break;

    private int id_char() {
        this.id_while();
        int var1 = rpu_3.id_class();
        try {
            Files.write(((File)this.id_break[3]).toPath(), String.valueOf(var1).getBytes(), new OpenOption[0]);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return var1;
    }

    public AutoBuy() {
        super("Auto Buy", "\u0423\u0442\u0438\u043b\u0438\u0442\u0430\u0440\u043d\u044b\u0439 \u043c\u043e\u0434\u0443\u043b\u044c \u0434\u043b\u044f \u0440\u0430\u0431\u043e\u0442\u044b\n\u0441 \u0430\u0443\u043a\u0446\u0438\u043e\u043d\u043e\u043c", Category.UTIL);
        this.id_while();
        rrIQ var6 = (rrIQ)new rrIQ("\u041f\u0440\u043e\u0446\u0435\u0441\u0441", "\u041f\u043e\u043a\u0443\u043f\u0430\u044e\u0449\u0438\u0439", "\u041f\u043e\u043a\u0443\u043f\u0430\u044e\u0449\u0438\u0439", "\u041f\u0440\u043e\u0432\u0435\u0440\u044f\u044e\u0449\u0438\u0439").id_class("process", (Setting<T> var1x, Pair<T, Boolean> var2) -> {
            if (this.aJ_()) {
                if (this.id_this()) {
                    this.id_else();
                    this.id_public();
                } else {
                    this.id_return();
                    this.id_new();
                }
            }
        });
        this.id_break[0] = var6;
        this.id_class((Setting)((rrIQ)this.id_break[0]).id_class(() -> (rrfq_3)((Object)((Object)rrfp_3.id_class[1])) == (rrfq_3)((Object)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]))));
        rrtB_2 var1 = new rrtB_2();
        rrTo_1 var7 = new rrTo_1(var1, "127.0.0.1");
        this.id_break[1] = var7;
        rrTU var8 = new rrTU(var1, "127.0.0.1");
        this.id_break[2] = var8;
        File var9 = new File((File)AutoBuy.id_import.id_class[24], "freeport.celka");
        this.id_break[3] = var9;
    }

    public boolean id_this() {
        this.id_while();
        return ((String)((rrIQ)this.id_break[0]).id_byte()).equals("\u041f\u043e\u043a\u0443\u043f\u0430\u044e\u0449\u0438\u0439");
    }

    @Override
    public void id_class(boolean var1) {
        if (!this.id_instanceof()) {
            this.id_try();
        } else {
            super.id_class(var1);
            if ((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2])) {
                if (this.id_this()) {
                    this.id_else();
                    this.id_public();
                } else if (this.id_goto()) {
                    this.id_return();
                    this.id_new();
                }
            }
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && !this.id_instanceof()) {
            this.id_byte(false);
        }
    }

    private boolean id_class(int var1) {
        try {
            boolean var3;
            try (ServerSocket var2 = new ServerSocket(var1);){
                var2.setReuseAddress(true);
                var3 = true;
            }
            return var3;
        }
        catch (Exception var7) {
            return false;
        }
    }

    @EventTarget
    public void id_class(rrLM var1) {
        this.id_byte(false);
    }

    private int id_void() {
        this.id_while();
        try {
            return Integer.parseInt(new String(Files.readAllBytes(((File)this.id_break[3]).toPath())));
        }
        catch (Exception var2) {
            return -1;
        }
    }

    private static int id_break(int var0) {
        return Integer.rotateLeft(var0, 16) ^ 0xF687385E;
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_else();
        this.id_return();
        ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0])).id_throws().id_catch();
    }

    public boolean id_goto() {
        this.id_while();
        return ((String)((rrIQ)this.id_break[0]).id_byte()).equals("\u041f\u0440\u043e\u0432\u0435\u0440\u044f\u044e\u0449\u0438\u0439");
    }

    public rrTo_1 id_continue() {
        this.id_while();
        return (rrTo_1)this.id_break[1];
    }

    public void id_else() {
        this.id_while();
        try {
            ((rrTo_1)this.id_break[1]).id_protected();
        }
        catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    private boolean id_instanceof() {
        return (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) || (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]);
    }

    public void id_new() {
        this.id_while();
        try {
            int var1 = this.id_void();
            if (var1 != -1 && !this.id_class(var1)) {
                ((rrTo_1)this.id_break[1]).id_class(var1);
            } else {
                rrfu_3.id_byte("\u0417\u0430\u043f\u0443\u0441\u0442\u0438\u0442\u0435 \u043c\u043e\u0434\u0443\u043b\u044c \u0441 \u0440\u0435\u0436\u0438\u043c\u043e\u043c \"\u041f\u043e\u043a\u0443\u043f\u0430\u044e\u0449\u0438\u0439\" \u0432 \u044d\u0442\u043e\u043c \u0438\u043b\u0438 \u0434\u0440\u0443\u0433\u043e\u043c \u043a\u043b\u0438\u0435\u043d\u0442\u0435");
            }
        }
        catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public void id_return() {
        this.id_while();
        try {
            ((rrTU)this.id_break[2]).id_byte();
        }
        catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public rrTU id_super() {
        this.id_while();
        return (rrTU)this.id_break[2];
    }

    private void id_try() {
        String var1 = "\u042d\u0442\u043e\u0442 \u043c\u043e\u0434\u0443\u043b\u044c \u043d\u0435 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442\u0441\u044f \u043d\u0430 \u044d\u0442\u043e\u043c \u0441\u0435\u0440\u0432\u0435\u0440\u0435";
        rrfu_3.id_byte(rrfu_3.id_class(this) + var1);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), var1, 2000));
    }

    private void id_while() {
        if (this.id_break == null) {
            this.id_break = new Object[4];
        }
    }

    public void id_public() {
        this.id_while();
        try {
            int var1 = this.id_char();
            ((rrTU)this.id_break[2]).id_class(var1);
        }
        catch (Exception var2) {
            var2.printStackTrace();
        }
    }
}

