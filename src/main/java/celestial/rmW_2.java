/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rmA_2;
import celestial.rmF_2;
import celestial.rmL_2;
import celestial.rmN_2;
import celestial.rmQ_2;
import celestial.rmc_3;
import celestial.rmk_3;
import celestial.rmn_3;
import celestial.rmu_3;
import celestial.rmz_3;
import celestial.rnW_2;
import celestial.rud_3;
import celestial.ryK_2;
import celestial.rya_3;
import celestial.ryo_3;
import com.mojang.authlib.GameProfile;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rmW_2
implements rmk_3 {
    private static final AtomicInteger id_break = new AtomicInteger(0);
    public static final Logger id_byte = LogManager.getLogger();
    private static final Random id_protected = new Random();
    private final byte[] id_throws = new byte[4];
    public final rnW_2 id_case;
    public final rud_3 id_class;
    public rmQ_2 id_catch = rmQ_2.HELLO;
    private int id_private;
    public GameProfile id_implements;
    private final String id_finally;
    private SecretKey id_extends;
    private rhN_2 id_native;

    public void id_byte() {
        rgP_2 rgP_22;
        if (!this.id_implements.isComplete()) {
            this.id_implements = this.id_class(this.id_implements);
        }
        if ((rgP_22 = this.id_case.x().id_class(this.id_class.id_byte(), this.id_implements)) != null) {
            this.id_class(rgP_22);
        } else {
            this.id_catch = rmQ_2.ACCEPTED;
            if (this.id_case.p() >= 0 && !this.id_class.id_protected()) {
                this.id_class.id_class(new rmL_2(this.id_case.p()), (GenericFutureListener<? extends Future<? super Void>>)((GenericFutureListener)future -> this.id_class.id_class(this.id_case.p())));
            }
            this.id_class.id_class(new rmn_3(this.id_implements));
            rhN_2 rhN_22 = this.id_case.x().id_class(this.id_implements.getId());
            if (rhN_22 != null) {
                this.id_catch = rmQ_2.DELAY_ACCEPT;
                this.id_native = this.id_case.x().id_throws(this.id_implements);
            } else {
                this.id_case.x().id_class(this.id_class, this.id_case.x().id_throws(this.id_implements));
            }
        }
    }

    public rmW_2(rnW_2 rnW_22, rud_3 rud_32) {
        this.id_finally = "";
        this.id_case = rnW_22;
        this.id_class = rud_32;
        id_protected.nextBytes(this.id_throws);
    }

    @Override
    public void id_class(rmu_3 rmu_32) {
        Validate.validState((this.id_catch == rmQ_2.HELLO ? 1 : 0) != 0, (String)"Unexpected hello packet", (Object[])new Object[0]);
        this.id_implements = rmu_32.id_break();
        if (this.id_case.B() && !this.id_class.id_protected()) {
            this.id_catch = rmQ_2.KEY;
            this.id_class.id_class(new rmA_2("", this.id_case.id_import().getPublic().getEncoded(), this.id_throws));
        } else {
            this.id_catch = rmQ_2.READY_TO_ACCEPT;
        }
    }

    @Override
    public void id_class(rmc_3 rmc_32) {
        String string;
        Object object;
        Validate.validState((this.id_catch == rmQ_2.KEY ? 1 : 0) != 0, (String)"Unexpected key packet", (Object[])new Object[0]);
        PrivateKey privateKey = this.id_case.id_import().getPrivate();
        try {
            if (!Arrays.equals(this.id_throws, rmc_32.id_break(privateKey))) {
                throw new IllegalStateException("Protocol error");
            }
            this.id_extends = rmc_32.id_class(privateKey);
            object = ryK_2.id_class(2, this.id_extends);
            Cipher cipher = ryK_2.id_class(1, this.id_extends);
            string = new BigInteger(ryK_2.id_class("", this.id_case.id_import().getPublic(), this.id_extends)).toString(16);
            this.id_catch = rmQ_2.AUTHENTICATING;
            this.id_class.id_class((Cipher)object, cipher);
        }
        catch (ryo_3 ryo_32) {
            throw new IllegalStateException("Protocol error", ryo_32);
        }
        object = new rmz_3(this, "User Authenticator #" + id_break.incrementAndGet(), string);
        ((Thread)object).setUncaughtExceptionHandler(new rya_3(id_byte));
        ((Thread)object).start();
    }

    @Override
    public void id_class(rmN_2 rmN_22) {
        this.id_class(new rgn_3("multiplayer.disconnect.unexpected_query_response"));
    }

    protected GameProfile id_class(GameProfile gameProfile) {
        UUID uUID = rhd_3.id_extends(gameProfile.getName());
        return new GameProfile(uUID, gameProfile.getName());
    }

    @Override
    public rud_3 id_class() {
        return this.id_class;
    }

    @Override
    public void id_class(rgP_2 rgP_22, rgP_2 rgP_23) {
        id_byte.info("{} lost connection: {}", (Object)this.id_protected(), (Object)rgP_23.getString());
    }

    public void id_class(rgP_2 rgP_22) {
        try {
            id_byte.info("Disconnecting {}: {}", (Object)this.id_protected(), (Object)rgP_22.getString());
            this.id_class.id_class(new rmF_2(rgP_22));
            this.id_class.id_class(rgP_22);
        }
        catch (Exception exception) {
            id_byte.error("Error whilst disconnecting player", (Throwable)exception);
        }
    }

    public void id_break() {
        rhN_2 rhN_22;
        if (this.id_catch == rmQ_2.READY_TO_ACCEPT) {
            this.id_byte();
        } else if (this.id_catch == rmQ_2.DELAY_ACCEPT && (rhN_22 = this.id_case.x().id_class(this.id_implements.getId())) == null) {
            this.id_catch = rmQ_2.READY_TO_ACCEPT;
            this.id_case.x().id_class(this.id_class, this.id_native);
            this.id_native = null;
        }
        if (this.id_private++ == 600) {
            this.id_class(new rgn_3("multiplayer.disconnect.slow_login"));
        }
    }

    public String id_protected() {
        return this.id_implements != null ? this.id_implements + " (" + this.id_class.id_byte() + ")" : String.valueOf(this.id_class.id_byte());
    }
}

