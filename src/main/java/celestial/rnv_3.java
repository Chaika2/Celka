/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.datafixers.DataFixer
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KY;
import celestial.gy_3;
import celestial.rAh_1;
import celestial.rAt_1;
import celestial.rCB;
import celestial.rCE;
import celestial.rCr_1;
import celestial.rFD;
import celestial.rFR;
import celestial.rFY;
import celestial.rFo_1;
import celestial.rRl_1;
import celestial.rRu_1;
import celestial.rVv_1;
import celestial.rYB;
import celestial.rdX_2;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rgV_2;
import celestial.rgw_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rnC_2;
import celestial.rnF_2;
import celestial.rnH_2;
import celestial.rnL_2;
import celestial.rnT_2;
import celestial.rnW_2;
import celestial.rnZ_2;
import celestial.rnc_3;
import celestial.rnp_3;
import celestial.roT_2;
import celestial.rqR_2;
import celestial.rqs_3;
import celestial.rqu_3;
import celestial.rrEm_1;
import celestial.rrGP;
import celestial.rrGk_1;
import celestial.rya_3;
import celestial.ryi_3;
import celestial.rys_3;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnv_3
extends rnW_2
implements rFR {
    public static final Logger id_finally = LogManager.getLogger();
    private static final Pattern id_extends = Pattern.compile("^[a-fA-F0-9]{40}$");
    private final List<rnL_2> id_native = Collections.synchronizedList(Lists.newArrayList());
    private rFo_1 id_volatile;
    private final rFD id_final;
    private rFY id_package;
    private final rnc_3 id_int;
    private rnT_2 id_new;
    private final rgw_3 id_continue;

    @Override
    public boolean id_boolean() {
        return this.id_int.id_class().id_try && super.id_boolean();
    }

    @Override
    public int id_byte() {
        return this.id_short();
    }

    @Override
    public boolean id_int() {
        return this.id_class().id_goto;
    }

    public rnv_3(Thread thread, rVv_1 rVv_12, rrGk_1 rrGk_12, rAt_1 rAt_12, rAh_1 rAh_12, rrGP rrGP2, rnc_3 rnc_32, DataFixer dataFixer, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, rCB rCB2, roT_2 roT_22) {
        super(thread, rVv_12, rrGk_12, rrGP2, rAt_12, Proxy.NO_PROXY, dataFixer, rAh_12, minecraftSessionService, gameProfileRepository, rCB2, roT_22);
        this.id_int = rnc_32;
        this.id_final = new rFD(this);
        this.id_continue = null;
    }

    @Override
    public void id_this() {
        super.id_this();
        rqR_2.id_private();
    }

    @Override
    public /* synthetic */ rCr_1 x() {
        return this.rG();
    }

    @Override
    public boolean s() {
        return this.id_class().id_protected && super.s();
    }

    @Override
    public int n() {
        return this.id_class().id_strictfp;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean id_interface() {
        return this.id_class().id_while;
    }

    @Override
    public rgV_2 id_class(rhN_2 rhN_22) {
        return this.id_continue != null ? this.id_continue.id_class(rhN_22.sv()) : null;
    }

    public void id_class(String string, gy_3 gy_32) {
        this.id_native.add(new rnL_2(string, gy_32));
    }

    @Override
    public boolean id_class(rRl_1 rRl_12, boolean bl, int n) {
        return false;
    }

    @Override
    public boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, rhd_3 rhd_32) {
        int n;
        if (rrEm_12.E() != rYB.id_byte) {
            return false;
        }
        if (this.rG().id_native().id_byte()) {
            return false;
        }
        if (this.rG().id_case(rhd_32.sv())) {
            return false;
        }
        if (this.N() <= 0) {
            return false;
        }
        rfH_2 rfH_23 = rrEm_12.X();
        int n2 = rfU_2.id_class(rfH_22.b_() - rfH_23.b_());
        int n3 = Math.max(n2, n = rfU_2.id_class(rfH_22.d_() - rfH_23.d_()));
        return n3 <= this.N();
    }

    @Override
    public rnp_3 id_class() {
        return this.id_int.id_class();
    }

    @Override
    public String id_class(String string) {
        this.id_final.id_class();
        this.id_catch(() -> this.f().id_class(this.id_final.id_byte(), string));
        return this.id_final.id_break();
    }

    @Override
    public int p() {
        return this.id_class().id_short;
    }

    public void rb() {
        if (this.id_new == null) {
            this.id_new = rnT_2.id_class(this);
        }
    }

    @Override
    public boolean z() {
        return this.id_new != null;
    }

    @Override
    public boolean u() {
        return this.id_class().id_for;
    }

    @Override
    public int r() {
        return this.id_class().id_void;
    }

    @Override
    public int N() {
        return this.id_class().id_char;
    }

    @Override
    public KY id_break(KY kY) {
        kY = super.id_break(kY);
        kY.id_case().id_class("Is Modded", () -> this.id_static().orElse("Unknown (can't tell)"));
        kY.id_case().id_class("Type", () -> "Dedicated Server (map_server.txt)");
        return kY;
    }

    @Override
    public void id_break(BooleanSupplier booleanSupplier) {
        super.id_break(booleanSupplier);
        this.rE();
    }

    @Override
    public int id_break(int n) {
        return this.id_class().id_double * n / 100;
    }

    @Override
    public String id_break() {
        return this.id_else();
    }

    @Override
    public boolean id_break(GameProfile gameProfile) {
        return false;
    }

    @Override
    public boolean H() {
        return this.id_class().id_const;
    }

    public void id_finally(boolean bl) {
        this.id_int.id_class(rnp_32 -> (rnp_3)rnp_32.P.id_class(this.rS(), bl));
    }

    @Override
    public String id_finally() {
        return "";
    }

    @Override
    public boolean G() {
        return this.id_class().id_throw;
    }

    @Override
    public boolean O() {
        return this.id_class().id_interface;
    }

    @Override
    public boolean id_extends() throws IOException {
        rnF_2 rnF_22 = new rnF_2(this, "Server console handler");
        rnF_22.setDaemon(true);
        rnF_22.setUncaughtExceptionHandler(new rya_3(id_finally));
        rnF_22.start();
        id_finally.info("Starting minecraft server version " + rqu_3.id_class().getName());
        if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
            id_finally.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
        }
        id_finally.info("Loading properties");
        rnp_3 rnp_32 = this.id_int.id_class();
        if (this.id_const()) {
            this.id_break("127.0.0.1");
        } else {
            this.id_protected(rnp_32.id_class);
            this.id_throws(rnp_32.id_break);
            this.id_break(rnp_32.id_byte);
        }
        this.id_case(rnp_32.id_case);
        this.id_catch(rnp_32.id_catch);
        this.id_class(rnp_32.id_private, this.rs());
        this.id_case(rnp_32.id_implements);
        this.id_private(rnp_32.id_finally);
        super.id_protected((Integer)rnp_32.r.get());
        this.id_implements(rnp_32.id_extends);
        this.id_implements.id_class(rnp_32.id_volatile);
        id_finally.info("Default game type: {}", (Object)rnp_32.id_volatile);
        InetAddress inetAddress = null;
        if (!this.id_else().isEmpty()) {
            inetAddress = InetAddress.getByName(this.id_else());
        }
        if (this.id_short() < 0) {
            this.id_class(rnp_32.id_package);
        }
        this.id_strictfp();
        id_finally.info("Starting Minecraft server on {}:{}", (Object)(this.id_else().isEmpty() ? "*" : this.id_else()), (Object)this.id_short());
        try {
            this.k().id_class(inetAddress, this.id_short());
        }
        catch (IOException iOException) {
            id_finally.warn("**** FAILED TO BIND TO PORT!");
            id_finally.warn("The exception was: {}", (Object)iOException.toString());
            id_finally.warn("Perhaps a server is already running on that port?");
            return false;
        }
        if (!this.B()) {
            id_finally.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
            id_finally.warn("The server will make no attempt to authenticate usernames. Beware.");
            id_finally.warn("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
            id_finally.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
        }
        if (this.rM()) {
            this.F().id_break();
        }
        if (!rCE.id_throws(this)) {
            return false;
        }
        this.id_class(new rnZ_2(this, this.id_case, this.id_throws));
        long l = rqR_2.id_byte();
        this.id_byte(rnp_32.id_int);
        rys_3.id_class(this.F());
        rys_3.id_class(this.Z());
        rCB.id_class(this.B());
        id_finally.info("Preparing level \"{}\"", (Object)this.id_implements());
        this.id_native();
        long l2 = rqR_2.id_byte() - l;
        String string = String.format(Locale.ROOT, "%.3fs", (double)l2 / 1.0E9);
        id_finally.info("Done ({})! For help, type \"help\"", (Object)string);
        if (rnp_32.id_new != null) {
            this.D().id_class(rRu_1.id_return).id_class(rnp_32.id_new, (rnW_2)this);
        }
        if (rnp_32.id_continue) {
            id_finally.info("Starting GS4 status listener");
            this.id_volatile = rFo_1.id_class(this);
        }
        if (rnp_32.id_this) {
            id_finally.info("Starting remote control listener");
            this.id_package = rFY.id_class(this);
        }
        if (this.rO() > 0L) {
            Thread thread = new Thread(new rnC_2(this));
            thread.setUncaughtExceptionHandler(new ryi_3(id_finally));
            thread.setName("Server Watchdog");
            thread.setDaemon(true);
            thread.start();
        }
        rdy_3.id_class.id_class(rdX_2.id_catch, rqs_3.id_class());
        if (rnp_32.id_transient) {
            rnH_2.id_class(this);
        }
        return true;
    }

    @Override
    public int id_continue() {
        return this.id_class().id_long;
    }

    @Override
    public String id_implements() {
        return this.id_protected.id_class();
    }

    @Override
    public int id_new() {
        return this.id_class().id_abstract;
    }

    @Override
    public boolean id_super() {
        return this.id_class().id_default;
    }

    @Override
    public boolean id_switch() {
        return true;
    }

    @Override
    public void id_throw() {
        if (this.id_continue != null) {
            this.id_continue.close();
        }
        if (this.id_new != null) {
            this.id_new.id_break();
        }
        if (this.id_package != null) {
            this.id_package.id_class();
        }
        if (this.id_volatile != null) {
            this.id_volatile.id_class();
        }
    }

    public String rs() {
        String string;
        rnp_3 rnp_32 = this.id_int.id_class();
        if (!rnp_32.id_public.isEmpty()) {
            string = rnp_32.id_public;
            if (!Strings.isNullOrEmpty((String)rnp_32.id_return)) {
                id_finally.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
            }
        } else if (!Strings.isNullOrEmpty((String)rnp_32.id_return)) {
            id_finally.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            string = rnp_32.id_return;
        } else {
            string = "";
        }
        if (!string.isEmpty() && !id_extends.matcher(string).matches()) {
            id_finally.warn("Invalid sha1 for ressource-pack-sha1");
        }
        if (!rnp_32.id_private.isEmpty() && string.isEmpty()) {
            id_finally.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
        }
        return string;
    }

    @Override
    public Optional<String> id_static() {
        String string = this.id_void();
        return !"vanilla".equals(string) ? Optional.of("Definitely; Server brand changed to '" + string + "'") : Optional.empty();
    }

    @Override
    public void id_protected(int n) {
        super.id_protected(n);
        this.id_int.id_class(rnp_32 -> (rnp_3)rnp_32.r.id_class(this.rS(), n));
    }

    @Override
    public String id_protected() {
        return this.h();
    }

    @Override
    public void id_volatile() {
        this.id_class(this.id_class().id_native, true);
    }

    @Override
    public boolean E() {
        return this.id_int.id_class().id_throws && super.E();
    }

    @Override
    public boolean rr() {
        return this.id_int.id_class().id_boolean;
    }

    public long rO() {
        return this.id_class().id_float;
    }

    protected boolean rM() {
        int n;
        int n2;
        int n3;
        int n4;
        boolean bl = false;
        for (n4 = 0; !bl && n4 <= 2; ++n4) {
            if (n4 > 0) {
                id_finally.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
                this.rk();
            }
            bl = rCE.id_class((rnW_2)this);
        }
        n4 = 0;
        for (n3 = 0; n4 == 0 && n3 <= 2; ++n3) {
            if (n3 > 0) {
                id_finally.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
                this.rk();
            }
            n4 = rCE.id_break(this) ? 1 : 0;
        }
        n3 = 0;
        for (n2 = 0; n3 == 0 && n2 <= 2; ++n2) {
            if (n2 > 0) {
                id_finally.warn("Encountered a problem while converting the op list, retrying in a few seconds");
                this.rk();
            }
            n3 = rCE.id_byte(this) ? 1 : 0;
        }
        n2 = 0;
        for (n = 0; n2 == 0 && n <= 2; ++n) {
            if (n > 0) {
                id_finally.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
                this.rk();
            }
            n2 = rCE.id_protected(this) ? 1 : 0;
        }
        n = 0;
        for (int i = 0; n == 0 && i <= 2; ++i) {
            if (i > 0) {
                id_finally.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
                this.rk();
            }
            n = rCE.id_class(this) ? 1 : 0;
        }
        return bl || n4 != 0 || n3 != 0 || n2 != 0 || n != 0;
    }

    public rnZ_2 rG() {
        return (rnZ_2)super.x();
    }

    private void rk() {
        try {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    public void rE() {
        while (!this.id_native.isEmpty()) {
            rnL_2 rnL_22 = this.id_native.remove(0);
            this.f().id_class(rnL_22.id_break, rnL_22.id_class);
        }
    }
}

