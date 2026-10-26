package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Py_1 extends Pv_1 implements PP {
   private static byte[] break_;
   private static short[] throws_;
   private static boolean[] case_;
   private static String[] catch_;

   private static void byte_() {
      case_ = new boolean[]{true, true, true, false, false, true, true, false, false, false};
   }

   public Py_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrLs_1 var1) {
      if ((vm_3)b_.class_[73] == null || (vm_3)b_.class_[73] instanceof Fu_1) {
         Vu_1 var2 = ((Qw_1)b_.class_[20]).c;
         int var3 = var1.protected_();
         int var4 = var1.class_();
         if (var4 == 1) {
            if (var3 == var2.int_().break_() && Vu_1.class_(var2)) {
               vm_3 var7 = (vm_3)b_.class_[73];
               if (var7 instanceof Fu_1 var6) {
                  rJY var12 = var6.int_();
                  if (var12 == null) {
                     return;
                  }

                  rdn_3 var5 = var12.class_().implements_();
                  if (var5.class_()) {
                     return;
                  }

                  rJr_1 var8 = var6.G_();

                  for (rJY var10 : var8.throws_) {
                     if (this.class_(var10.class_(), var5, var10.protected_)) {
                        ((Ax_1)b_.class_[55]).break_(var8.case_, var10.protected_, 1, rXa_1.THROW, true);
                     }
                  }
               } else {
                  rdn_3 var11 = ((cb_3)b_.class_[57]).ss().implements_();
                  if (var11.class_()) {
                     return;
                  }

                  for (int var13 = case_[3]; var13 < 36; var13++) {
                     int var14 = rrfY_2.break_(var13);
                     if (this.class_(((rhz_3)((cb_3)b_.class_[57]).implements_[1]).extends_(var13), var11, var14)) {
                        ((Ax_1)b_.class_[55]).break_(0, var14, 1, rXa_1.THROW, true);
                     }
                  }

                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
               }
            }
         }
      }
   }

   private boolean class_(rdn_3 var1, rdn_3 var2, int var3) {
      if ((vm_3)b_.class_[73] instanceof FH && var3 < 9) {
         return false;
      } else if (var1 != null && var2 != null) {
         return var1.break_() != var2.break_() ? false : rdn_3.class_(var1, var2, Set.of("Damage", "display"));
      } else {
         return case_[8];
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1787790246;
   }

   private static void class_() {
      throws_ = new short[]{73, 73, 20, 73, 55, 57, 57, 1, 55, 0, 73};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4197874435238539839L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, 18, 16, 22, -72, 9, -45, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new byte[]{36, 9};
   }

   private static void protected_() {
      catch_ = new String[]{new String("Damage"), new String("display")};
   }
}
