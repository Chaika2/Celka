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
   private static final Logger id_class = LogManager.getLogger();
   private final QY id_break;
   private final vm_3 id_byte;
   private final Consumer<rgP_2> id_protected;
   private final rud_3 id_throws;
   private GameProfile id_case;

   public Al_1(rud_3 var1, QY var2, vm_3 var3, Consumer<rgP_2> var4) {
      this.id_throws = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public void id_class(rmF_2 var1) {
      this.id_throws.id_class(var1.id_break());
   }

   @Override
   public void id_class(rmL_2 var1) {
      if (!this.id_throws.id_protected()) {
         this.id_throws.id_class(var1.id_break());
      }
   }

   @Override
   public void id_class(rmv_3 var1) {
      this.id_protected.accept(new rgn_3("connect.negotiating"));
      this.id_throws.id_class(new rmN_2(var1.id_break(), (ruu_3)null));
   }

   @Override
   public rud_3 id_class() {
      return this.id_throws;
   }

   private rgP_2 id_class(String var1) {
      try {
         this.id_break().joinServer(this.id_break.id_while().id_throws(), this.id_break.id_while().id_protected(), var1);
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
   public void id_class(rmn_3 var1) {
      this.id_protected.accept(new rgn_3("connect.joining"));
      this.id_case = var1.id_break();
      this.id_throws.id_class(ruv_3.PLAY);
      this.id_throws.id_class(new Aq_1(this.id_break, this.id_byte, this.id_throws, this.id_case));
   }

   @Override
   public void id_class(rgP_2 var1, rgP_2 var2) {
      this.id_break.id_break(new ZG(this.id_byte, cN_2.id_implements, var2));
   }

   @Override
   public void id_class(rmA_2 var1) {
      Cipher var2;
      Cipher var3;
      String var4;
      rmc_3 var5;
      try {
         SecretKey var6 = ryK_2.id_class();
         PublicKey var7 = var1.id_byte();
         var4 = new BigInteger(ryK_2.id_class(var1.id_break(), var7, var6)).toString(16);
         var2 = ryK_2.id_class(2, var6);
         var3 = ryK_2.id_class(1, var6);
         var5 = new rmc_3(var6, var7, var1.id_protected());
      } catch (ryo_3 var8) {
         throw new IllegalStateException("Protocol error", var8);
      }

      this.id_protected.accept(new rgn_3("connect.authorizing"));
      rpu_3.id_class.submit(() -> {
         rgP_2 var5x = this.id_class(var4);
         if (var5x != null) {
            if (this.id_break.S() == null || !this.id_break.S().id_protected()) {
               this.id_throws.id_class(var5x);
               return;
            }

            id_class.warn(var5x.getString());
         }

         this.id_protected.accept(new rgn_3("connect.encrypting"));
         this.id_throws.id_class(var5, var3xx -> this.id_throws.id_class(var2, var3));
      });
   }

   private MinecraftSessionService id_break() {
      return this.id_break.r();
   }
}
