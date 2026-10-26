package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Al_1 implements AH {
   private static final Logger class_ = LogManager.getLogger();
   private final QY break_;
   private final vm_3 byte_;
   private final Consumer<rgP_2> protected_;
   private final rud_3 throws_;
   private GameProfile case_;

   public Al_1(rud_3 var1, QY var2, vm_3 var3, Consumer<rgP_2> var4) {
      this.throws_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public void class_(rmF_2 var1) {
      this.throws_.class_(var1.break_());
   }

   @Override
   public void class_(rmL_2 var1) {
      if (!this.throws_.protected_()) {
         this.throws_.class_(var1.break_());
      }
   }

   @Override
   public void class_(rmv_3 var1) {
      this.protected_.accept(new rgn_3("connect.negotiating"));
      this.throws_.class_(new rmN_2(var1.break_(), (ruu_3)null));
   }

   @Override
   public rud_3 class_() {
      return this.throws_;
   }

   private rgP_2 class_(String var1) {
      try {
         this.break_().joinServer(this.break_.while_().throws_(), this.break_.while_().protected_(), var1);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return new rgn_3("disconnect.loginFailedInfo", new rgn_3("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return new rgn_3("disconnect.loginFailedInfo", new rgn_3("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return new rgn_3("disconnect.loginFailedInfo", new rgn_3("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (AuthenticationException var6) {
         return new rgn_3("disconnect.loginFailedInfo", var6.getMessage());
      }
   }

   @Override
   public void class_(rmn_3 var1) {
      this.protected_.accept(new rgn_3("connect.joining"));
      this.case_ = var1.break_();
      this.throws_.class_(ruv_3.PLAY);
      this.throws_.class_(new Aq_1(this.break_, this.byte_, this.throws_, this.case_));
   }

   @Override
   public void class_(rgP_2 var1, rgP_2 var2) {
      this.break_.break_(new ZG(this.byte_, cN_2.implements_, var2));
   }

   @Override
   public void class_(rmA_2 var1) {
      Cipher var2;
      Cipher var3;
      String var4;
      rmc_3 var5;
      try {
         SecretKey var6 = ryK_2.class_();
         PublicKey var7 = var1.byte_();
         var4 = new BigInteger(ryK_2.class_(var1.break_(), var7, var6)).toString(16);
         var2 = ryK_2.class_(2, var6);
         var3 = ryK_2.class_(1, var6);
         var5 = new rmc_3(var6, var7, var1.protected_());
      } catch (ryo_3 var8) {
         throw new IllegalStateException("Protocol error", var8);
      }

      this.protected_.accept(new rgn_3("connect.authorizing"));
      rpu_3.class_.submit(() -> {
         rgP_2 var5x = this.class_(var4);
         if (var5x != null) {
            if (this.break_.S() == null || !this.break_.S().protected_()) {
               this.throws_.class_(var5x);
               return;
            }

            class_.warn(var5x.getString());
         }

         this.protected_.accept(new rgn_3("connect.encrypting"));
         this.throws_.class_(var5, var3xx -> this.throws_.class_(var2, var3));
      });
   }

   private MinecraftSessionService break_() {
      return this.break_.r();
   }
}
