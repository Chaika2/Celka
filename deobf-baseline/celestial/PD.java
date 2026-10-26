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
   private static short[] id_throws;
   private static String[] id_case;
   private static boolean[] id_catch;
   public static Object[] id_break;
   private static byte[] id_private;

   private void id_byte(rrLO var1) {
      rgP_2 var2 = var1.id_byte();
      if (!(var2 instanceof rVe_1)) {
         Aw_1 var3 = var1.id_break();
         GameProfile var4 = ((cb_3)b_.id_class[id_throws[0]]).sv();
         if (var3 != null && !var3.id_class().equals(var4)) {
            String var5 = var1.id_protected().replace(var4.getName(), id_case[0]);
            String var6 = var5.toLowerCase();
            if (this.id_class(var6, (Set<String>)id_break[id_throws[1]])) {
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[2]]).id_finally().id_class(rrFp_1.id_class(var3));
            } else if (this.id_class(var6, (Set<String>)id_break[id_throws[3]])) {
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[4]]).id_finally().id_class(rrFq_1.id_class(var3));
            } else {
               Matcher var7 = ((Pattern)id_break[id_throws[5]]).matcher(var6);
               if (var7.matches()) {
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[6]]).id_finally().id_class(rrFT.id_class(var3, var7.group(id_private[0])));
               } else {
                  HashSet var8 = new HashSet();
                  HashSet var9 = new HashSet<>(Arrays.asList(var6.split(id_case[1])));
                  String var10 = var4.getName();
                  String var11 = var3.id_class().getName();
                  if (var9.contains(var10.toLowerCase()) && !var11.equalsIgnoreCase(var10)) {
                     var8.add(var10);
                  }

                  for (rrZk_1 var13 : ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_throws[7]]).id_class().values()) {
                     String var14 = var13.id_class();
                     if (var9.contains(var14.toLowerCase()) && !var11.equalsIgnoreCase(var14)) {
                        var8.add(var14);
                     }
                  }

                  if (!var8.isEmpty()) {
                     ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[8]]).id_finally().id_class(rrFy_1.id_class(var3, var8));
                  }
               }
            }
         }
      }
   }

   private static void id_byte() {
      id_throws = new short[]{57, 0, 0, 1, 0, 3, 0, 0, 0, 1, 5, 0, 5};
   }

   public PD(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      Object[] var0 = new Object[]{
         Set.of(id_case[5], id_case[6]),
         Set.of(id_case[7], id_case[8], id_case[9]),
         Set.of(id_case[10], id_case[11]),
         Pattern.compile(".*\\b(warp|варп)\\s+(\\S+).*", 2)
      };
      id_break = var0;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 533168233;
   }

   private boolean id_class(String var1, Set<String> var2) {
      for (String var4 : var2) {
         if (var1.contains(var4)) {
            return id_catch[0];
         }
      }

      return id_catch[1];
   }

   @Override
   public void id_class(rrLO var1) {
      this.id_byte(var1);
      this.id_break(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -51747505662903231L;
   }

   private void id_break(rrLO var1) {
      String var2 = var1.id_protected();
      rgP_2 var3 = var1.id_byte();
      if (!(var3 instanceof rVe_1)) {
         if ((rrfq_3)rrfp_3.id_class[id_throws[9]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[10]]
            && var2.contains(id_case[2])
            && (var2.contains(id_case[3]) || var2.contains(id_case[4]))) {
            ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[id_throws[11]])
               .id_class((rrZr_1)rrQJ.id_class[id_throws[12]], var2, rrfp_3.id_throws());
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, 99, -128, -110, -87, 48, -128, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_private = new byte[]{2, 2, 2, 2, 3, 4};
   }

   private static void id_throws() {
      id_case = new String[]{
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

   private static void id_protected() {
      id_catch = new boolean[]{true, false, false, true};
   }
}
