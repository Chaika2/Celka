package celestial;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PD extends Pv_1 implements PP {
   private static short[] throws_;
   private static String[] case_;
   private static boolean[] catch_;
   public static Object[] break_;
   private static byte[] private_;

   private void byte_(rrLO var1) {
      rgP_2 var2 = var1.byte_();
      if (!(var2 instanceof rVe_1)) {
         Aw_1 var3 = var1.break_();
         GameProfile var4 = ((cb_3)b_.class_[57]).sv();
         if (var3 != null && !var3.class_().equals(var4)) {
            String var5 = var1.protected_().replace(var4.getName(), "");
            String var6 = var5.toLowerCase();
            if (this.class_(var6, (Set<String>)break_[0])) {
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrFp_1.class_(var3));
            } else if (this.class_(var6, (Set<String>)break_[1])) {
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrFq_1.class_(var3));
            } else {
               Matcher var7 = ((Pattern)break_[3]).matcher(var6);
               if (var7.matches()) {
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrFT.class_(var3, var7.group(2)));
               } else {
                  HashSet var8 = new HashSet();
                  HashSet var9 = new HashSet<>(Arrays.asList(var6.split("\\s+")));
                  String var10 = var4.getName();
                  String var11 = var3.class_().getName();
                  if (var9.contains(var10.toLowerCase()) && !var11.equalsIgnoreCase(var10)) {
                     var8.add(var10);
                  }

                  for (rrZk_1 var13 : ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_().values()) {
                     String var14 = var13.class_();
                     if (var9.contains(var14.toLowerCase()) && !var11.equalsIgnoreCase(var14)) {
                        var8.add(var14);
                     }
                  }

                  if (!var8.isEmpty()) {
                     ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrFy_1.class_(var3, var8));
                  }
               }
            }
         }
      }
   }

   private static void byte_() {
      throws_ = new short[]{57, 0, 0, 1, 0, 3, 0, 0, 0, 1, 5, 0, 5};
   }

   public PD(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      Object[] var0 = new Object[]{
         Set.of("/pvp", "/пвп"), Set.of("спек", "spec", "spek"), Set.of("warp", "варп"), Pattern.compile(".*\\b(warp|варп)\\s+(\\S+).*", 2)
      };
      break_ = var0;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 533168233;
   }

   private boolean class_(String var1, Set<String> var2) {
      for (String var4 : var2) {
         if (var1.contains(var4)) {
            return true;
         }
      }

      return catch_[1];
   }

   @Override
   public void class_(rrLO var1) {
      this.byte_(var1);
      this.break_(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -51747505662903231L;
   }

   private void break_(rrLO var1) {
      String var2 = var1.protected_();
      rgP_2 var3 = var1.byte_();
      if (!(var3 instanceof rVe_1)) {
         if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[5]
            && var2.contains("Polar")
            && (var2.contains(" > ") || var2.contains("mitigated"))) {
            ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[0]).class_((rrZr_1)rrQJ.class_[5], var2, rrfp_3.throws_());
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, 99, -128, -110, -87, 48, -128, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      private_ = new byte[]{2, 2, 2, 2, 3, 4};
   }

   private static void throws_() {
      case_ = new String[]{
         new String(""),
         new String("\\s+"),
         new String("Polar"),
         new String(" > "),
         new String("mitigated"),
         new String("/pvp"),
         new String("/пвп"),
         new String("спек"),
         new String("spec"),
         new String("spek"),
         new String("warp"),
         new String("варп"),
         new String("|")
      };
   }

   private static void protected_() {
      catch_ = new boolean[]{true, false, false, true};
   }
}
