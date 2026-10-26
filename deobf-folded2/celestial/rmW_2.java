package celestial;

import com.mojang.authlib.GameProfile;
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

public class rmW_2 implements rmk_3 {
   private static final AtomicInteger id_break = new AtomicInteger(0);
   static final Logger id_byte = LogManager.getLogger();
   private static final Random id_protected = new Random();
   private final byte[] id_throws = new byte[4];
   final rnW_2 id_case;
   public final rud_3 id_class;
   rmQ_2 id_catch = rmQ_2.HELLO;
   private int id_private;
   GameProfile id_implements;
   private final String id_finally = "";
   private SecretKey id_extends;
   private rhN_2 id_native;

   public void id_byte() {
      if (!this.id_implements.isComplete()) {
         this.id_implements = this.id_class(this.id_implements);
      }

      rgP_2 var1 = this.id_case.x().id_class(this.id_class.id_byte(), this.id_implements);
      if (var1 != null) {
         this.id_class(var1);
      } else {
         this.id_catch = rmQ_2.ACCEPTED;
         if (this.id_case.p() >= 0 && !this.id_class.id_protected()) {
            this.id_class.id_class(new rmL_2(this.id_case.p()), var1x -> this.id_class.id_class(this.id_case.p()));
         }

         this.id_class.id_class(new rmn_3(this.id_implements));
         rhN_2 var2 = this.id_case.x().id_class(this.id_implements.getId());
         if (var2 != null) {
            this.id_catch = rmQ_2.DELAY_ACCEPT;
            this.id_native = this.id_case.x().id_throws(this.id_implements);
         } else {
            this.id_case.x().id_class(this.id_class, this.id_case.x().id_throws(this.id_implements));
         }
      }
   }

   public rmW_2(rnW_2 var1, rud_3 var2) {
      this.id_case = var1;
      this.id_class = var2;
      id_protected.nextBytes(this.id_throws);
   }

   @Override
   public void id_class(rmu_3 var1) {
      Validate.validState(this.id_catch == rmQ_2.HELLO, "Unexpected hello packet", new Object[0]);
      this.id_implements = var1.id_break();
      if (this.id_case.B() && !this.id_class.id_protected()) {
         this.id_catch = rmQ_2.KEY;
         this.id_class.id_class(new rmA_2("", this.id_case.id_import().getPublic().getEncoded(), this.id_throws));
      } else {
         this.id_catch = rmQ_2.READY_TO_ACCEPT;
      }
   }

   @Override
   public void id_class(rmc_3 var1) {
      Validate.validState(this.id_catch == rmQ_2.KEY, "Unexpected key packet", new Object[0]);
      PrivateKey var2 = this.id_case.id_import().getPrivate();

      String var3;
      try {
         if (!Arrays.equals(this.id_throws, var1.id_break(var2))) {
            throw new IllegalStateException("Protocol error");
         }

         this.id_extends = var1.id_class(var2);
         Cipher var4 = ryK_2.id_class(2, this.id_extends);
         Cipher var5 = ryK_2.id_class(1, this.id_extends);
         var3 = new BigInteger(ryK_2.id_class("", this.id_case.id_import().getPublic(), this.id_extends)).toString(16);
         this.id_catch = rmQ_2.AUTHENTICATING;
         this.id_class.id_class(var4, var5);
      } catch (ryo_3 var6) {
         throw new IllegalStateException("Protocol error", var6);
      }

      rmz_3 var7 = new rmz_3(this, "User Authenticator #" + id_break.incrementAndGet(), var3);
      var7.setUncaughtExceptionHandler(new rya_3(id_byte));
      var7.start();
   }

   @Override
   public void id_class(rmN_2 var1) {
      this.id_class(new rgn_3("multiplayer.disconnect.unexpected_query_response"));
   }

   protected GameProfile id_class(GameProfile var1) {
      UUID var2 = rhd_3.id_extends(var1.getName());
      return new GameProfile(var2, var1.getName());
   }

   @Override
   public rud_3 id_class() {
      return this.id_class;
   }

   @Override
   public void id_class(rgP_2 var1, rgP_2 var2) {
      id_byte.info("{} lost connection: {}", this.id_protected(), var2.getString());
   }

   public void id_class(rgP_2 var1) {
      try {
         id_byte.info("Disconnecting {}: {}", this.id_protected(), var1.getString());
         this.id_class.id_class(new rmF_2(var1));
         this.id_class.id_class(var1);
      } catch (Exception var3) {
         id_byte.error("Error whilst disconnecting player", var3);
      }
   }

   public void id_break() {
      if (this.id_catch == rmQ_2.READY_TO_ACCEPT) {
         this.id_byte();
      } else if (this.id_catch == rmQ_2.DELAY_ACCEPT) {
         rhN_2 var1 = this.id_case.x().id_class(this.id_implements.getId());
         if (var1 == null) {
            this.id_catch = rmQ_2.READY_TO_ACCEPT;
            this.id_case.x().id_class(this.id_class, this.id_native);
            this.id_native = null;
         }
      }

      if (this.id_private++ == 600) {
         this.id_class(new rgn_3("multiplayer.disconnect.slow_login"));
      }
   }

   public String id_protected() {
      return this.id_implements != null ? this.id_implements + " (" + this.id_class.id_byte() + ")" : String.valueOf(this.id_class.id_byte());
   }
}
