/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.AJ;
import celestial.KY;
import celestial.QY;
import celestial.Qn_1;
import celestial.Qw_1;
import celestial.cb_3;
import celestial.rAh_1;
import celestial.rAt_1;
import celestial.rCB;
import celestial.rRh_1;
import celestial.rRl_1;
import celestial.rVv_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rhN_2;
import celestial.rnV_2;
import celestial.rnW_2;
import celestial.roT_2;
import celestial.rqu_3;
import celestial.rrEm_1;
import celestial.rrGP;
import celestial.rrGk_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.File;
import java.io.IOException;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rng_3
extends rnW_2 {
    private static final Logger id_volatile = LogManager.getLogger();
    private final QY id_final;
    private boolean id_package;
    private int id_int = -1;
    private AJ id_new;
    private UUID id_continue;
    private long id_super = 0L;
    public rYB id_finally = null;
    public rfH_2 id_extends = null;
    public rRh_1 id_native = null;

    private void id_byte(rrEm_1 rrEm_12) {
        if (rrEm_12.id_private(1.0f) > 0.0f || rrEm_12.S()) {
            rrEm_12.id_class(6000, 0, false, false);
        }
    }

    public rng_3(Thread thread, QY qY, rVv_1 rVv_12, rrGk_1 rrGk_12, rAt_1 rAt_12, rAh_1 rAh_12, rrGP rrGP2, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, rCB rCB2, roT_2 roT_22) {
        super(thread, rVv_12, rrGk_12, rrGP2, rAt_12, qY.W(), qY.id_protected(), rAh_12, minecraftSessionService, gameProfileRepository, rCB2, roT_22);
        this.id_throws(qY.id_while().id_byte());
        this.id_byte(qY.id_int());
        this.id_byte(256);
        this.id_class(new rnV_2(this, this.id_case, this.id_throws));
        this.id_final = qY;
    }

    @Override
    public void id_this() {
        super.id_this();
        if (this.id_new != null) {
            this.id_new.interrupt();
            this.id_new = null;
        }
    }

    @Override
    public boolean d() {
        return this.id_int > -1;
    }

    @Override
    public boolean id_class(rRl_1 rRl_12, boolean bl, int n) {
        try {
            this.k().id_class(null, n);
            id_volatile.info("Started serving on {}", (Object)n);
            this.id_int = n;
            this.id_new = new AJ(this.h(), "" + n);
            this.id_new.start();
            this.x().id_class(rRl_12);
            this.x().id_break(bl);
            int n2 = this.id_class(((cb_3)this.id_final.id_class[57]).sv());
            ((cb_3)this.id_final.id_class[57]).id_class(n2);
            for (rhN_2 rhN_22 : this.x().id_super()) {
                this.f().id_class(rhN_22);
            }
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    public void id_class(KY kY) {
        this.id_final.id_break(kY);
    }

    @Override
    public void id_class(UUID uUID) {
        this.id_continue = uUID;
    }

    @Override
    public void id_class(boolean bl) {
        if (!rrxr_3.Bk.id_byte() || this.id_synchronized()) {
            this.id_catch(() -> {
                for (rhN_2 rhN_22 : Lists.newArrayList(this.x().id_super())) {
                    if (rhN_22.ro().equals(this.id_continue)) continue;
                    this.x().id_byte(rhN_22);
                }
            });
        }
        super.id_class(bl);
        if (this.id_new != null) {
            this.id_new.interrupt();
            this.id_new = null;
        }
    }

    @Override
    public void id_class(rRl_1 rRl_12) {
        super.id_class(rRl_12);
        this.x().id_class(rRl_12);
    }

    @Override
    public void id_class(BooleanSupplier booleanSupplier) {
        this.id_break();
        boolean bl = this.id_package;
        boolean bl2 = this.id_package = QY.id_instanceof().id_void() != null && QY.id_instanceof().id_throw();
        if (!bl && this.id_package) {
            this.x().id_implements();
            this.id_class(false, false, false);
        }
        if (!this.id_package) {
            super.id_class(booleanSupplier);
            int n = Math.max(2, ((Qw_1)this.id_final.id_class[20]).id_break + -1);
            if (n != this.x().id_new()) {
                id_volatile.info("Changing view distance to {}, from {}", (Object)n, (Object)this.x().id_new());
                this.x().id_class(n);
            }
        }
    }

    public rRh_1 id_class(rYB rYB2, rfH_2 rfH_22) {
        this.id_finally = rYB2;
        this.id_extends = rfH_22;
        return this.id_native;
    }

    @Override
    public boolean id_class(boolean bl, boolean bl2, boolean bl3) {
        if (bl) {
            int n;
            int n2 = this.Q();
            if ((long)n2 < this.id_super + (long)(n = ((Qw_1)this.id_final.id_class[20]).rL)) {
                return false;
            }
            this.id_super = n2;
        }
        return super.id_class(bl, bl2, bl3);
    }

    @Override
    public int id_short() {
        return this.id_int;
    }

    @Override
    public int r() {
        return 0;
    }

    @Override
    public KY id_break(KY kY) {
        kY = super.id_break(kY);
        kY.id_case().id_class("Type", "Integrated Server (map_client.txt)");
        kY.id_case().id_class("Is Modded", () -> this.id_static().orElse("Probably not. Jar signature remains and both client + server brands are untouched."));
        return kY;
    }

    @Override
    public boolean id_break(GameProfile gameProfile) {
        return gameProfile.getName().equalsIgnoreCase(this.id_default());
    }

    @Override
    public int id_break(int n) {
        return (int)(((Qw_1)this.id_final.id_class[20]).id_byte * (float)n);
    }

    private void id_break() {
        for (rrEm_1 rrEm_12 : this.id_float()) {
            this.id_break(rrEm_12);
        }
    }

    private void id_break(rrEm_1 rrEm_12) {
        if (!rrbb_3.l()) {
            this.id_protected(rrEm_12);
        }
        if (!rrbb_3.m()) {
            this.id_byte(rrEm_12);
        }
        if (this.id_finally == rrEm_12 && this.id_extends != null) {
            this.id_native = rrEm_12.id_throws(this.id_extends);
            this.id_finally = null;
            this.id_extends = null;
        }
    }

    @Override
    public boolean H() {
        return true;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean O() {
        return true;
    }

    @Override
    public boolean id_extends() {
        id_volatile.info("Starting integrated minecraft server version " + rqu_3.id_class().getName());
        this.id_protected(true);
        this.id_case(true);
        this.id_catch(true);
        this.id_strictfp();
        if (rrxr_3.Sr.id_byte() && !rrxr_3.id_break(rrxr_3.Sr, this)) {
            return false;
        }
        this.id_native();
        this.id_case(this.id_default() + " - " + this.rB().id_volatile());
        return rrxr_3.SP.id_byte() ? rrxr_3.id_break(rrxr_3.SP, this) : true;
    }

    @Override
    public int id_continue() {
        return 2;
    }

    @Override
    public File id_instanceof() {
        return (File)this.id_final.id_class[24];
    }

    @Override
    public int id_new() {
        return 2;
    }

    @Override
    public boolean id_super() {
        return true;
    }

    @Override
    public boolean id_switch() {
        return false;
    }

    @Override
    public Optional<String> id_static() {
        String string = Qn_1.id_class();
        if (!string.equals("vanilla")) {
            return Optional.of("Definitely; Client brand changed to '" + string + "'");
        }
        string = this.id_void();
        if (!"vanilla".equals(string)) {
            return Optional.of("Definitely; Server brand changed to '" + string + "'");
        }
        return QY.class.getSigners() == null ? Optional.of("Very likely; Jar signature invalidated") : Optional.empty();
    }

    private void id_protected(rrEm_1 rrEm_12) {
        if (this.id_package() == rRl_1.CREATIVE) {
            long l = rrEm_12.P();
            long l2 = l % 24000L;
            if (rrbb_3.C()) {
                if (l2 <= 1000L) {
                    rrEm_12.id_class(l - l2 + 1001L);
                }
                if (l2 >= 11000L) {
                    rrEm_12.id_class(l - l2 + 24001L);
                }
            }
            if (rrbb_3.H()) {
                if (l2 <= 14000L) {
                    rrEm_12.id_class(l - l2 + 14001L);
                }
                if (l2 >= 22000L) {
                    rrEm_12.id_class(l - l2 + 24000L + 14001L);
                }
            }
        }
    }

    @Override
    public boolean rr() {
        return ((Qw_1)this.id_final.id_class[20]).rb;
    }
}

