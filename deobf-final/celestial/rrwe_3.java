package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwe_3 implements rrZS<rrwU_2> {
   private static short[] byte_;
   public Object[] break_;
   private static byte[] protected_;
   private static boolean[] throws_;

   public rrwU_2 byte_(String var1) {
      return this.break_().stream().filter(var1x -> var1x.break_().getName().equalsIgnoreCase(var1 + ".celka")).findFirst().orElse(null);
   }

   @Override
   public boolean byte_(String var1, boolean var2) {
      rrwU_2 var3 = this.byte_(var1);
      return this.byte_(var3, var2);
   }

   public void byte_() {
      this.break_().forEach(var1 -> this.class_(var1, true));
   }

   public boolean byte_(rrwU_2 var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else {
         JsonObject var3 = new JsonObject();
         var1.break_(var3);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_(var1.break_(), var3);
         return true;
      }
   }

   public rrwe_3() {
      this.extends_();
      ArrayList var5 = new ArrayList();
      this.break_[0] = var5;
      this.native_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 458027390;
   }

   public boolean class_(rrwU_2 var1, boolean var2) {
      try {
         if (var1 == null) {
            return throws_[2];
         } else {
            File var3 = var1.break_();
            if (var3 == null) {
               return throws_[3];
            } else {
               JsonElement var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[byte_[5]]).break_().break_(var3);
               if (var4 != null && var4.isJsonObject()) {
                  JsonObject var5 = var4.getAsJsonObject();
                  if (var5 == null) {
                     return throws_[5];
                  } else {
                     var1.class_(var5);
                     return throws_[6];
                  }
               } else {
                  return throws_[4];
               }
            }
         }
      } catch (Exception var6) {
         return false;
      }
   }

   @Override
   public void class_() {
      for (rrwU_2 var2 : this.break_()) {
         if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_(var2.break_())) {
            this.break_(var2, true);
         }
      }
   }

   public void class_(rrwU_2... var1) {
      ((List)this.break_[0]).addAll(List.of(var1));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1284804121679007691L;
   }

   public boolean class_(rrwU_2 var1) {
      return false;
   }

   @Override
   public boolean class_(String var1, boolean var2) {
      rrwU_2 var3 = this.byte_(var1);
      return this.class_(var3, var2);
   }

   @Override
   public void class_(boolean var1) {
   }

   public boolean break_(rrwU_2 var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else {
         File var3 = var1.break_();
         ((List)this.break_[0]).remove(var1);
         return var3.exists() && var3.delete() ? true : throws_[14];
      }
   }

   @Override
   public void break_(boolean var1) {
      for (rrwU_2 var3 : this.break_()) {
         this.class_(var3, var1);
      }
   }

   @Override
   public Collection<rrwU_2> break_() {
      return (List)this.break_[0];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{27, -122, 55, -125, 94, 62, -21, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean break_(String var1, boolean var2) {
      rrwU_2 var3 = this.byte_(var1);
      return var3 != null && this.break_(var3, var2) ? true : throws_[11];
   }

   public rrIb_1 throws_() {
      return (rrIb_1)this.break_[2];
   }

   private static void finally_() {
      throws_ = new boolean[]{false, true, false, false, false, false, true, false, false, true, true, false, false, true, false, true, false, true, true};
   }

   public void catch_() {
      this.break_().forEach(var1 -> this.byte_(var1, true));
   }

   private void extends_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
      }
   }

   public rrIG case_() {
      return (rrIG)this.break_[1];
   }

   private static void implements_() {
      byte_ = new short[]{0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 1, 2, 3};
   }

   public rrIP protected_() {
      return (rrIP)this.break_[3];
   }

   private static void private_() {
      protected_ = new byte[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 4};
   }

   private void native_() {
      rrwU_2[] var10001 = new rrwU_2[]{new rrIM(), new rrIO(), new rrIs_1(), new rrwa_3(), null, null, null, null, null, null, null, null};
      rrIG var5;
      rrIG var10004 = var5 = new rrIG();
      this.break_[1] = var5;
      var10001[4] = var10004;
      rrIb_1 var6;
      rrIb_1 var8 = var6 = new rrIb_1();
      this.break_[2] = var6;
      var10001[5] = var8;
      var10001[6] = new rrIS();
      var10001[7] = new rrIE();
      var10001[8] = new rrIB();
      var10001[9] = new rrIh_1();
      var10001[10] = new rrIr_1();
      rrIP var7;
      rrIP var9 = var7 = new rrIP();
      this.break_[3] = var7;
      var10001[11] = var9;
      this.class_(var10001);
   }
}
