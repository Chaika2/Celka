package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqZ_2 extends rrqN_2 {
   private static byte[] byte_;
   private static long[] protected_;
   private static short[] case_;
   private static boolean[] catch_;
   private static String[] private_;
   public Object[] class_;

   private static void byte_() {
      case_ = new short[]{0, 1, 3, 0, 3, 2, 1, 3, 2, 2, 3, 1, 2, 2, 3, 1, 0, 2, 3, 0, 0, 0, 1, 0};
   }

   public rrqZ_2(XRay<?> var1) {
      super(var1);
      this.case_();
      HashMap var6 = new HashMap();
      this.class_[0] = var6;
      HashSet var7 = new HashSet();
      this.class_[1] = var7;
      Long var8 = -1L;
      this.class_[3] = var8;
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.case_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         XRay var2 = this.continue_();
         this.final_().removeIf(var1x -> {
            this.case_();
            rfH_2 var2x = var1x.break_();
            if (rrjc_3.protected_(var2x) == xu_3.Jx) {
               ((Map)this.class_[0]).put(var2x, var1x);
               return false;
            } else if (((Map)this.class_[0]).containsKey(var2x)) {
               ((Set)this.class_[1]).remove(var1x);
               ((Map)this.class_[0]).remove(var2x);
               return true;
            } else {
               return catch_[9];
            }
         });
         if ((Long)this.class_[3] != -1L && (Integer)this.class_[2] > 0 && !((Set)this.class_[1]).isEmpty() && rqR_2.break_() - (Long)this.class_[3] > 100L) {
            int var3 = (Integer)this.class_[2];
            String var4 = rql_3.class_((long)var3, "Был найден", "Было найдено", "Было найдено");
            String var5 = rql_3.class_((long)var3, "Древний обломок", "Древних обломка", "Древних обломков");
            rVi_1 var6 = new rgN_2("").break_(rgF_2.GRAY).break_(rrfu_3.class_((Module)var2) + var4 + " " + rgF_2.RED + var3 + " " + rgF_2.GRAY + var5);
            rrfu_3.class_(var6);
            Integer var11 = 0;
            this.class_[2] = var11;
            Long var12 = -1L;
            this.class_[3] = var12;
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1756624687;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5811737766451232406L;
   }

   private rrqc_3 class_(xd_3 var1, rfH_2 var2) {
      return new rrqc_3(
         new rrqz_3(var1, ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).class_(var1)),
         new rfH_2(var2),
         new rja_3(var2.b_(), var2.c_(), var2.d_())
      );
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      ruS_2 var2 = var1.class_();
      if (var2 instanceof rvC_2 var3) {
         var3.class_((var1x, var2x) -> this.break_(var1x, var2x));
      } else if (var2 instanceof rZR var4) {
         this.break_(var4.byte_(), var4.break_());
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{64, -31, -127, 19, 59, -91, 79, -106}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      protected_ = new long[]{-1L, -1L, 100L, -1L, -1L, 0L};
   }

   private void break_(rfH_2 var1, xc_3 var2) {
      this.case_();
      xd_3 var3 = var2.break_();
      if (var3 == xu_3.Jx) {
         rrqc_3 var4 = this.class_(var3, var1);
         this.class_(var4);
         if (((Set)this.class_[1]).add(var4)) {
            Integer var9 = (Integer)this.class_[2] + 1;
            this.class_[2] = var9;
            Long var10 = rqR_2.break_();
            this.class_[3] = var10;
         }
      }
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         this.class_[2] = 0;
         this.class_[3] = 0L;
      }
   }

   private static void implements_() {
      catch_ = new boolean[]{false, true, false, true, false, true, false, false, true, false, false};
   }

   private static void protected_() {
      private_ = new String[]{
         new String("Был найден"),
         new String("Было найдено"),
         new String("Было найдено"),
         new String("Древний обломок"),
         new String("Древних обломка"),
         new String("Древних обломков"),
         new String("")
      };
   }

   private static void private_() {
      byte_ = new byte[]{3, 2, 3, 2, 4, 2, 3};
   }

   @Override
   public boolean aK_() {
      this.case_();
      ((Set)this.class_[1]).clear();
      ((Map)this.class_[0]).clear();
      Integer var5 = 0;
      this.class_[2] = var5;
      Long var6 = -1L;
      this.class_[3] = var6;
      return super.aK_();
   }
}
