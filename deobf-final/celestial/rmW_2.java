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
   private static final AtomicInteger break_ = new AtomicInteger(0);
   static final Logger byte_ = LogManager.getLogger();
   private static final Random protected_ = new Random();
   private final byte[] throws_ = new byte[4];
   final rnW_2 case_;
   public final rud_3 class_;
   rmQ_2 catch_ = rmQ_2.HELLO;
   private int private_;
   GameProfile implements_;
   private final String finally_ = "";
   private SecretKey extends_;
   private rhN_2 native_;

   public void byte_() {
      if (!this.implements_.isComplete()) {
         this.implements_ = this.class_(this.implements_);
      }

      rgP_2 var1 = this.case_.x().class_(this.class_.byte_(), this.implements_);
      if (var1 != null) {
         this.class_(var1);
      } else {
         this.catch_ = rmQ_2.ACCEPTED;
         if (this.case_.p() >= 0 && !this.class_.protected_()) {
            this.class_.class_(new rmL_2(this.case_.p()), var1x -> this.class_.class_(this.case_.p()));
         }

         this.class_.class_(new rmn_3(this.implements_));
         rhN_2 var2 = this.case_.x().class_(this.implements_.getId());
         if (var2 != null) {
            this.catch_ = rmQ_2.DELAY_ACCEPT;
            this.native_ = this.case_.x().throws_(this.implements_);
         } else {
            this.case_.x().class_(this.class_, this.case_.x().throws_(this.implements_));
         }
      }
   }

   public rmW_2(rnW_2 var1, rud_3 var2) {
      this.case_ = var1;
      this.class_ = var2;
      protected_.nextBytes(this.throws_);
   }

   @Override
   public void class_(rmu_3 var1) {
      Validate.validState(this.catch_ == rmQ_2.HELLO, "Unexpected hello packet", new Object[0]);
      this.implements_ = var1.break_();
      if (this.case_.B() && !this.class_.protected_()) {
         this.catch_ = rmQ_2.KEY;
         this.class_.class_(new rmA_2("", this.case_.import_().getPublic().getEncoded(), this.throws_));
      } else {
         this.catch_ = rmQ_2.READY_TO_ACCEPT;
      }
   }

   @Override
   public void class_(rmc_3 var1) {
      Validate.validState(this.catch_ == rmQ_2.KEY, "Unexpected key packet", new Object[0]);
      PrivateKey var2 = this.case_.import_().getPrivate();

      String var3;
      try {
         if (!Arrays.equals(this.throws_, var1.break_(var2))) {
            throw new IllegalStateException("Protocol error");
         }

         this.extends_ = var1.class_(var2);
         Cipher var4 = ryK_2.class_(2, this.extends_);
         Cipher var5 = ryK_2.class_(1, this.extends_);
         var3 = new BigInteger(ryK_2.class_("", this.case_.import_().getPublic(), this.extends_)).toString(16);
         this.catch_ = rmQ_2.AUTHENTICATING;
         this.class_.class_(var4, var5);
      } catch (ryo_3 var6) {
         throw new IllegalStateException("Protocol error", var6);
      }

      rmz_3 var7 = new rmz_3(this, "User Authenticator #" + break_.incrementAndGet(), var3);
      var7.setUncaughtExceptionHandler(new rya_3(byte_));
      var7.start();
   }

   @Override
   public void class_(rmN_2 var1) {
      this.class_(new rgn_3("multiplayer.disconnect.unexpected_query_response"));
   }

   protected GameProfile class_(GameProfile var1) {
      UUID var2 = rhd_3.extends_(var1.getName());
      return new GameProfile(var2, var1.getName());
   }

   @Override
   public rud_3 class_() {
      return this.class_;
   }

   @Override
   public void class_(rgP_2 var1, rgP_2 var2) {
      byte_.info("{} lost connection: {}", this.protected_(), var2.getString());
   }

   public void class_(rgP_2 var1) {
      try {
         byte_.info("Disconnecting {}: {}", this.protected_(), var1.getString());
         this.class_.class_(new rmF_2(var1));
         this.class_.class_(var1);
      } catch (Exception var3) {
         byte_.error("Error whilst disconnecting player", var3);
      }
   }

   public void break_() {
      if (this.catch_ == rmQ_2.READY_TO_ACCEPT) {
         this.byte_();
      } else if (this.catch_ == rmQ_2.DELAY_ACCEPT) {
         rhN_2 var1 = this.case_.x().class_(this.implements_.getId());
         if (var1 == null) {
            this.catch_ = rmQ_2.READY_TO_ACCEPT;
            this.case_.x().class_(this.class_, this.native_);
            this.native_ = null;
         }
      }

      if (this.private_++ == 600) {
         this.class_(new rgn_3("multiplayer.disconnect.slow_login"));
      }
   }

   public String protected_() {
      return this.implements_ != null ? this.implements_ + " (" + this.class_.byte_() + ")" : String.valueOf(this.class_.byte_());
   }
}
