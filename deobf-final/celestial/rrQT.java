package celestial;

import com.google.common.hash.Hashing;
import com.mojang.blaze3d.systems.RenderSystem;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.Validate;

public class rrQT implements MinecraftAccessor {
   private static int[] break_;
   private static long[] byte_;
   private static byte[] protected_;
   public Object[] class_;
   private static float[] throws_;
   private static boolean[] case_;
   private static String[] catch_;
   private static short[] private_;

   public rrQC byte_() {
      return (rrQC)this.class_[0];
   }

   private static void int_() {
      catch_ = new String[]{new String("Must be 64 pixels wide"), new String("Must be 64 pixels high")};
   }

   public rrQT(rrQC var1, Ak_1 var2) {
      this.extends_();
      rruv_1 var7 = new rruv_1(0.0F, 0.0F, 0.0F, 0.0F);
      this.class_[5] = var7;
      this.class_[0] = var1;
      this.class_[1] = var2;
      rqO_2 var10 = new rqO_2("servers/" + Hashing.sha1().hashUnencodedChars(var2.break_) + "/icon");
      this.class_[2] = var10;
      fk_3 var11 = (fk_3)import_.A().break_((rqO_2)this.class_[2]);
      this.class_[3] = var11;
   }

   static {
      ntfClinit();
   }

   private static void class_(Ml_1 var0, int var1, int var2, int var3, int var4, rqO_2 var5) {
      import_.A().class_(var5);
      RenderSystem.enableBlend();
      ch_3.class_(var0, var1, var2, 0.0F, 0.0F, var3, var4, var3, var4);
      RenderSystem.disableBlend();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2134454388027434165L;
   }

   public boolean class_(double var1, double var3, int var5) {
      if (((rruv_1)this.class_[5]).break_((float)var1, (float)var3) && var5 == 0) {
         import_.break_(new mt_3((vm_3)import_.class_[73], import_, (Ak_1)this.class_[1]));
         return true;
      } else {
         return case_[2];
      }
   }

   public void class_(rruv_1 var1) {
      this.class_[5] = var1;
   }

   public boolean class_(String var1) {
      if (var1 == null) {
         import_.A().byte_((rqO_2)this.class_[2]);
         if ((fk_3)this.class_[3] != null && ((fk_3)this.class_[3]).break_() != null) {
            ((fk_3)this.class_[3]).break_().close();
         }

         Object var7 = null;
         this.class_[3] = var7;
      } else {
         try {
            fN_2 var2 = fN_2.class_(var1);
            Validate.validState(var2.class_() == protected_[1] ? case_[3] : case_[4], catch_[0], new Object[case_[5]]);
            Validate.validState(var2.break_() == protected_[2] ? case_[6] : case_[7], catch_[1], new Object[case_[8]]);
            if ((fk_3)this.class_[private_[37]] == null) {
               fk_3 var8 = new fk_3(var2);
               this.class_[private_[38]] = var8;
            } else {
               ((fk_3)this.class_[private_[39]]).class_(var2);
               ((fk_3)this.class_[private_[40]]).class_();
            }

            import_.A().class_((rqO_2)this.class_[private_[41]], (fk_3)this.class_[private_[42]]);
         } catch (Throwable var9) {
            return false;
         }
      }

      return case_[10];
   }

   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      if (!((Ak_1)this.class_[1]).private_) {
         ((Ak_1)this.class_[1]).private_ = true;
         ((Ak_1)this.class_[1]).throws_ = -2L;
         ((Ak_1)this.class_[1]).protected_ = rgN_2.byte_;
         ((Ak_1)this.class_[1]).byte_ = rgN_2.byte_;
         vF_2.class_.submit(() -> {
            try {
               ((rrQC)this.class_[private_[49]]).final_().class_((Ak_1)this.class_[private_[50]], () -> {
               });
            } catch (UnknownHostException var2x) {
               ((Ak_1)this.class_[1]).throws_ = -1L;
               ((Ak_1)this.class_[1]).protected_ = vF_2.catch_;
            } catch (Exception var3x) {
               ((Ak_1)this.class_[1]).throws_ = -1L;
               ((Ak_1)this.class_[1]).protected_ = vF_2.private_;
            }
         });
      }

      float var5 = ((rruv_1)this.class_[5]).break_();
      float var6 = ((rruv_1)this.class_[5]).protected_();
      float var7 = ((rruv_1)this.class_[5]).byte_();
      float var8 = ((rruv_1)this.class_[5]).class_();
      String var9 = ((Ak_1)this.class_[1]).byte_();
      if (!Objects.equals(var9, (String)this.class_[4])) {
         if (this.class_(var9)) {
            this.class_[4] = var9;
         } else {
            ((Ak_1)this.class_[1]).class_(null);
         }
      }

      RenderSystem.color4f(throws_[4], 1.0F, 1.0F, 1.0F);
      boolean var10 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().super_();
      if (var10 && (Ak_1)this.class_[1] instanceof rrwA_2) {
         Object var16 = null;
         this.class_[3] = var16;
      }

      if ((fk_3)this.class_[3] != null) {
         class_(var1, (int)var5, (int)var6, (int)var7, (int)var8, (rqO_2)this.class_[2]);
      } else {
         class_(var1, (int)var5, (int)var6, (int)var7, (int)var8, vF_2.throws_);
      }

      if (((Qw_1)import_.class_[20]).S || ((rruv_1)this.class_[5]).break_((float)var2, (float)var3)) {
         import_.A().class_(vF_2.case_);
         ch_3.class_(var1, var5, var6, var5 + var7, var6 + var8, -1601138544);
         ch_3.class_(var1, (int)var5 - 2, (int)var6, 0.0F, 16.0F, (int)var7, (int)var8, 128, 128);
      }
   }

   public rruv_1 class_() {
      return (rruv_1)this.class_[5];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1964203141;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, 72, 42, -87, 0, 95, 105, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String break_() {
      return (String)this.class_[4];
   }

   public fk_3 throws_() {
      return (fk_3)this.class_[3];
   }

   private static void finally_() {
      protected_ = new byte[]{2, 64, 64, 6};
   }

   private static void catch_() {
      break_ = new int[]{-1601138544};
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
      }
   }

   public rqO_2 case_() {
      return (rqO_2)this.class_[2];
   }

   private static void package_() {
      byte_ = new long[]{-2L, -1L, -1L};
   }

   public Ak_1 protected_() {
      return (Ak_1)this.class_[1];
   }

   private static void final_() {
      case_ = new boolean[]{true, true, false, true, false, false, true, false, false, false, true};
   }

   private static void volatile_() {
      private_ = new short[]{
         5,
         0,
         1,
         2,
         2,
         3,
         1,
         1,
         1,
         1,
         1,
         5,
         5,
         5,
         5,
         1,
         4,
         4,
         1,
         0,
         1,
         3,
         3,
         2,
         20,
         5,
         128,
         128,
         5,
         73,
         1,
         5,
         2,
         3,
         3,
         3,
         3,
         3,
         3,
         3,
         3,
         2,
         3,
         0,
         1,
         2,
         3,
         4,
         5,
         0,
         1,
         1,
         1,
         1,
         1
      };
   }

   private static void native_() {
      throws_ = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 16.0F, 0.0F, 0.0F};
   }
}
