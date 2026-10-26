package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.StringUtils;

public class rrwv_3 extends vm_3 {
   private static int[] case_;
   public static Object[] class_;
   private static boolean[] catch_;
   private static String[] private_;
   private static short[] implements_;
   public Object[] throws_;
   private static byte[] finally_;

   private static void char_() {
      private_ = new String[]{
         new String(""),
         new String(":"),
         new String("ui.proxyserver.options.invalidIpPort"),
         new String(""),
         new String(""),
         new String("ui.proxyserver.options.proxyType"),
         new String("ui.proxyserver.options.auth"),
         new String("ui.proxyserver.options.ipPort"),
         new String("ui.proxyserver.auth.id"),
         new String("ui.proxyserver.auth.username"),
         new String("ui.proxyserver.auth.password"),
         new String("SOCKS4"),
         new String("Socks 4"),
         new String("Socks 5"),
         new String("ui.proxyserver.options.apply"),
         new String("ui.proxyserver.options.test"),
         new String("ui.proxyserver.options.proxyEnabled"),
         new String("ui.proxyserver.options.proxyEnabled"),
         new String("ui.proxyserver.options.cancel"),
         new String(""),
         new String("none"),
         new String("ui.proxyserver.err.specProxy"),
         new String("mc.funtime.su"),
         new String("Socks 4"),
         new String("Socks 5"),
         new String("ui.proxyserver.options.proxy")
      };
   }

   private void byte_(int var1, int var2, int var3) {
      this.finally_();
      Integer var11 = this.package_ / 2 - var2 / 2;
      this.throws_[8] = var11;
      int[] var12 = new int[var1];
      this.throws_[7] = var12;
      int var4 = (this.int_ + var1 * var3) / 2;
      int var5 = var4 - var1 * var3;

      for (int var6 = 0; var6 != var1; var6++) {
         ((int[])this.throws_[7])[var6] = var5 + var3 * var6;
      }
   }

   private static boolean byte_(String var0) {
      String[] var1 = var0.split(":");
      if (var1.length > 1) {
         if (!StringUtils.isNumeric(var1[1])) {
            return false;
         } else {
            try {
               int var2 = Integer.parseInt(var1[catch_[4]]);
               return var2 >= 0 && var2 <= case_[0] ? catch_[5] : catch_[6];
            } catch (NumberFormatException var3) {
               return false;
            }
         }
      } else {
         return catch_[8];
      }
   }

   private static void int_() {
      implements_ = new short[]{
         0,
         0,
         6,
         9,
         5,
         1,
         6,
         1,
         8,
         7,
         7,
         6,
         9,
         0,
         4,
         1,
         4,
         150,
         7,
         7,
         150,
         7,
         1,
         0,
         150,
         7,
         2,
         150,
         7,
         150,
         7,
         2,
         3,
         6,
         6,
         9,
         0,
         7,
         9,
         1,
         2,
         3,
         23,
         160,
         1,
         0,
         8,
         7,
         0,
         8,
         7,
         1,
         1,
         1024,
         1,
         1,
         1,
         8,
         7,
         2,
         2,
         255,
         2,
         1,
         2,
         8,
         7,
         3,
         3,
         255,
         3,
         1,
         3,
         7,
         7,
         7,
         0,
         4,
         4,
         7,
         6,
         23,
         5,
         1,
         1,
         6,
         9,
         9,
         25565,
         0,
         1,
         2,
         3,
         0,
         1,
         2,
         3,
         1,
         4,
         0,
         1,
         0,
         0,
         0,
         0
      };
   }

   public rrwv_3(vm_3 var1) {
      super(new rgN_2((String)class_[0]));
      this.finally_();
      Boolean var6 = false;
      this.throws_[0] = var6;
      String var7 = "";
      this.throws_[6] = var7;
      rrwJ_2 var8 = new rrwJ_2();
      this.throws_[9] = var8;
      this.throws_[5] = var1;
   }

   static {
      ntfClinit();
   }

   private boolean interface_() {
      this.finally_();
      if (!byte_(((Lu_1)this.throws_[1]).private_())) {
         String var5 = rgF_2.RED + new rgn_3("ui.proxyserver.options.invalidIpPort").getString();
         this.throws_[6] = var5;
         ((Lu_1)this.throws_[1]).byte_(true);
         return false;
      } else {
         return catch_[11];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, -95, 81, -99, 44, 58, 4, -5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.finally_();
      this.class_(var1);
      if (((LC)this.throws_[4]).private_() && !byte_(((Lu_1)this.throws_[1]).private_())) {
         ((LC)this.throws_[4]).catch_();
      }

      break_(var1, this.super_, new rgn_3("ui.proxyserver.options.proxyType").getString(), this.package_ / 2 - 150, ((int[])this.throws_[7])[1] + 5, 10526880);
      class_(
         var1, this.super_, new rgn_3("ui.proxyserver.options.auth").getString(), this.package_ / 2, ((int[])this.throws_[7])[3] + 8, rgF_2.WHITE.protected_()
      );
      break_(var1, this.super_, new rgn_3("ui.proxyserver.options.ipPort").getString(), this.package_ / 2 - 150, ((int[])this.throws_[7])[2] + 5, 10526880);
      ((Lu_1)this.throws_[1]).class_(var1, var2, var3, var4);
      if ((Boolean)this.throws_[0]) {
         break_(var1, this.super_, new rgn_3("ui.proxyserver.auth.id").getString(), this.package_ / 2 - 150, ((int[])this.throws_[7])[4] + 5, 10526880);
         ((Lu_1)this.throws_[2]).class_(var1, var2, var3, var4);
      } else {
         break_(var1, this.super_, new rgn_3("ui.proxyserver.auth.username").getString(), this.package_ / 2 - 150, ((int[])this.throws_[7])[4] + 5, 10526880);
         break_(var1, this.super_, new rgn_3("ui.proxyserver.auth.password").getString(), this.package_ / 2 - 150, ((int[])this.throws_[7])[5] + 5, 10526880);
         ((Lu_1)this.throws_[2]).class_(var1, var2, var3, var4);
         ((Lu_1)this.throws_[3]).class_(var1, var2, var3, var4);
      }

      class_(
         var1,
         this.super_,
         !((String)this.throws_[6]).isEmpty() ? (String)this.throws_[6] : (String)((rrwJ_2)this.throws_[9]).class_[0],
         this.package_ / 2,
         ((int[])this.throws_[7])[6] + 5,
         10526880
      );
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.finally_();
      super.class_(var1, var2, var3);
      String var8 = "";
      this.throws_[6] = var8;
      rrwJ_2 var10000 = (rrwJ_2)this.throws_[9];
      String var9 = "";
      var10000.class_[0] = var9;
      return true;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5601165732233054887L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1663554574;
   }

   private void finally_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[10];
         Object[] var1 = this.throws_;
         var1[0] = false;
         var1[8] = 0;
      }
   }

   private static void package_() {
      catch_ = new boolean[]{
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   @Override
   public void private_() {
      this.finally_();
      super.private_();
      ((rrwJ_2)this.throws_[9]).class_();
      ((Lu_1)this.throws_[1]).catch_();
      ((Lu_1)this.throws_[2]).catch_();
      ((Lu_1)this.throws_[3]).catch_();
   }

   private static void abstract_() {
      Object[] var0 = new Object[]{new String("Proxy")};
      class_ = var0;
   }

   private static void final_() {
      case_ = new int[]{65535, 10526880, 10526880, 10526880, 10526880, 10526880, 10526880};
   }

   @Override
   public void volatile_() {
      this.finally_();
      super.volatile_();
      String var5 = "";
      this.throws_[6] = var5;
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }

   private static void native_() {
      finally_ = new byte[]{
         2,
         2,
         2,
         2,
         5,
         2,
         3,
         8,
         2,
         2,
         5,
         2,
         4,
         5,
         2,
         4,
         5,
         2,
         5,
         5,
         2,
         6,
         5,
         10,
         26,
         20,
         2,
         20,
         4,
         20,
         5,
         20,
         2,
         2,
         3,
         2,
         8,
         2,
         3,
         20,
         2,
         3,
         8,
         2,
         3,
         20,
         2,
         15,
         2,
         7,
         20,
         2,
         3,
         2,
         8,
         2,
         3,
         20,
         10,
         8
      };
   }

   @Override
   public void v_() {
      this.finally_();
      super.v_();
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      short var1 = 160;
      this.byte_(10, var1, 26);
      Boolean var11 = ((rrwu_3)rrwZ_2.class_[1]).protected_.equals("SOCKS4");
      this.throws_[0] = var11;
      LF var2 = new LF((Integer)this.throws_[8], ((int[])this.throws_[7])[1], var1, 20, new rgN_2(this.throws_[0] ? "Socks 4" : private_[13]), var1x -> {
         this.finally_();
         Boolean var6x = !this.throws_[0] ? true : catch_[19];
         this.throws_[0] = var6x;
         var1x.break_(new rgN_2(this.throws_[0] ? "Socks 4" : private_[24]));
      });
      this.class_((LF)var2);
      Lu_1 var12 = new Lu_1(this.super_, (Integer)this.throws_[8], ((int[])this.throws_[7])[2], var1, 20, rgN_2.byte_);
      this.throws_[1] = var12;
      ((Lu_1)this.throws_[1]).implements_(1024);
      ((Lu_1)this.throws_[1]).class_(((rrwu_3)rrwZ_2.class_[1]).break_);
      this.class_((Lu_1)this.throws_[1]);
      Lu_1 var13 = new Lu_1(this.super_, (Integer)this.throws_[8], ((int[])this.throws_[7])[4], var1, 20, rgN_2.byte_);
      this.throws_[2] = var13;
      ((Lu_1)this.throws_[2]).implements_(255);
      ((Lu_1)this.throws_[2]).class_(((rrwu_3)rrwZ_2.class_[1]).byte_);
      this.class_((Lu_1)this.throws_[2]);
      Lu_1 var14 = new Lu_1(this.super_, (Integer)this.throws_[8], ((int[])this.throws_[7])[5], var1, 20, rgN_2.byte_);
      this.throws_[3] = var14;
      ((Lu_1)this.throws_[3]).implements_(255);
      ((Lu_1)this.throws_[3]).class_(((rrwu_3)rrwZ_2.class_[1]).class_);
      this.class_((Lu_1)this.throws_[3]);
      int var3 = this.package_ / 2 - var1 / 2 * 3 / 2;
      LF var4 = new LF(
         var3,
         ((int[])this.throws_[7])[8],
         var1 / 2 - 3,
         20,
         new rgn_3("ui.proxyserver.options.apply"),
         var1x -> {
            this.finally_();
            if (this.interface_()) {
               rrwu_3 var6x = new rrwu_3(
                  (Boolean)this.throws_[0], ((Lu_1)this.throws_[1]).private_(), ((Lu_1)this.throws_[2]).private_(), ((Lu_1)this.throws_[3]).private_()
               );
               rrwZ_2.class_[1] = var6x;
               Boolean var7 = ((LC)this.throws_[4]).private_();
               rrwZ_2.class_[0] = var7;
               rrwN_2.class_((rrwu_3)rrwZ_2.class_[1]);
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).protected_().class_();
               import_.break_(new vG_2(new rrvL()));
            }
         }
      );
      this.class_((LF)var4);
      LF var5 = new LF(
         var3 + var1 / 2 + 3,
         ((int[])this.throws_[7])[8],
         var1 / 2 - 3,
         20,
         new rgn_3("ui.proxyserver.options.test"),
         var1x -> {
            this.finally_();
            if (!((Lu_1)this.throws_[1]).private_().isEmpty() && !((Lu_1)this.throws_[1]).private_().equalsIgnoreCase("none")) {
               if (this.interface_()) {
                  rrwJ_2 var7 = new rrwJ_2();
                  this.throws_[9] = var7;
                  ((rrwJ_2)this.throws_[9])
                     .class_(
                        "mc.funtime.su",
                        25565,
                        new rrwu_3(
                           (Boolean)this.throws_[0], ((Lu_1)this.throws_[1]).private_(), ((Lu_1)this.throws_[2]).private_(), ((Lu_1)this.throws_[3]).private_()
                        )
                     );
               }
            } else {
               String var6x = rgF_2.RED + new rgn_3("ui.proxyserver.err.specProxy").getString();
               this.throws_[6] = var6x;
            }
         }
      );
      this.class_((LF)var5);
      LC var15 = new LC(
         this.package_ / 2 - (15 + this.super_.class_(new rgn_3("ui.proxyserver.options.proxyEnabled"))) / 2,
         ((int[])this.throws_[7])[7],
         var1,
         20,
         new rgn_3("ui.proxyserver.options.proxyEnabled"),
         (Boolean)rrwZ_2.class_[0]
      );
      this.throws_[4] = var15;
      this.class_((LC)this.throws_[4]);
      LF var6 = new LF(var3 + (var1 / 2 + 3) * 2, ((int[])this.throws_[7])[8], var1 / 2 - 3, 20, new rgn_3("ui.proxyserver.options.cancel"), var1x -> {
         this.finally_();
         import_.break_((vm_3)this.throws_[5]);
      });
      this.class_((LF)var6);
   }
}
