package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpL_2 extends rrTF<FtHelper> {
   private static boolean[] id_break;
   public Object[] id_class;
   private static String[] id_byte;
   private static byte[] id_protected;
   private static long[] id_case;
   private static short[] id_catch;

   private boolean id_byte() {
      this.id_class();
      return (rgP_2)this.id_class[id_catch[10]] == null
         ? id_break[4]
         : ((Pattern)Pj_1.id_break[id_catch[11]]).matcher(((rgP_2)this.id_class[id_catch[12]]).id_byte()).find();
   }

   public rrpL_2(FtHelper var1) {
      super(var1);
      this.id_class();
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrAZ var1) {
      if (var1.id_class() instanceof Fc_1 var2 && this.id_byte()) {
         if (this.id_continue().id_continue()) {
            this.id_class(var2);
         }

         return;
      }
   }

   @EventTarget
   public void id_class(rrLU var1) {
      this.id_class();
      vm_3 var2 = var1.id_class();
      rgP_2 var7 = var2 == null ? null : var2.id_new();
      this.id_class[id_catch[2]] = var7;
      Integer var8 = Integer.valueOf(id_break[0]);
      this.id_class[id_catch[3]] = var8;
   }

   private void id_class(Fc_1 var1) {
      this.id_class();
      if ((rgP_2)this.id_class[id_catch[6]] != null) {
         rVi_1 var2 = ((rgP_2)this.id_class[id_catch[7]]).id_case();
         if ((Integer)this.id_class[id_catch[8]] > 0) {
            var2.id_break(id_byte[0]).id_class(new rgN_2(this.id_finally()).id_break(rgF_2.RED));
         }

         String var3 = this.id_break();
         if (var3 != null) {
            var2.id_break(id_byte[1]).id_class(new rgN_2(var3).id_break(rgF_2.YELLOW));
         }

         var1.id_class(var2);
      }
   }

   @EventTarget
   public void id_class(rrFo_1 var1) {
      this.id_class();
      Object var6 = null;
      this.id_class[id_catch[4]] = var6;
      Integer var7 = Integer.valueOf(id_break[1]);
      this.id_class[id_catch[5]] = var7;
   }

   private int id_class(List<rJY> var1) {
      int var2 = id_break[5];

      for (rJY var4 : var1) {
         if (var4.id_break()) {
            rrNt_1 var5 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_catch[13]]).id_break(var4);
            if (var5 != null && var5.id_case() != id_protected[2]) {
               var2 += var5.id_case();
            }
         }
      }

      return var2;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8981317241478819756L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1688258107;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, 93, -120, 96, -25, -8, 67, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[1] = 0;
      }
   }

   @EventTarget
   public void id_class(rrAT var1) {
      this.id_class();
      vm_3 var3 = (vm_3)id_import.id_class[id_catch[0]];
      if (var3 instanceof Fc_1 var2 && this.id_byte()) {
         rJr_1 var10 = var1.id_class();
         List var4 = var10.id_class(null);
         Integer var9 = this.id_class(var4);
         this.id_class[id_catch[1]] = var9;
         this.id_class(var2);
         return;
      }
   }

   private String id_break() {
      if (!this.id_continue().id_continue()) {
         return null;
      } else {
         Pj_1 var1 = C_throws.id_byte().id_package();
         if (var1.id_byte()) {
            return null;
         } else {
            long var2 = System.currentTimeMillis() - var1.id_break();
            long var4 = Math.max(id_case[0], var1.id_class() - var2 - id_case[1]);
            long var6 = (var4 + id_case[2]) / id_case[3];
            long var8 = var6 / id_case[4];
            long var10 = var6 % id_case[5];
            String var10000 = id_byte[2];
            Object[] var10001 = new Object[id_protected[1]];
            var10001[id_break[2]] = var8;
            var10001[id_break[3]] = var10;
            return String.format(var10000, var10001);
         }
      }
   }

   private static void id_throws() {
      id_protected = new byte[]{44, 2, -1, 2};
   }

   private String id_finally() {
      this.id_class();
      return "[$" + rql_3.id_class((Integer)this.id_class[id_catch[9]], (char)id_protected[0]) + "]";
   }

   private static void id_case() {
      id_case = new long[]{0L, 1000L, 999L, 1000L, 60L, 60L};
   }

   private static void id_implements() {
      id_catch = new short[]{73, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0};
   }

   private static void id_protected() {
      id_byte = new String[]{new String(" "), new String(" "), new String("[⟲ %d:%02d]")};
   }

   private static void id_private() {
      id_break = new boolean[]{false, false, false, true, false, false, true, false};
   }
}
