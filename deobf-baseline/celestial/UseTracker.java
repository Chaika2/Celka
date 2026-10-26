package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class UseTracker extends Module {
   private static String[] id_byte;
   private static short[] id_protected;
   private static long[] id_throws;
   public Object[] id_break;
   private static byte[] id_catch;
   private static boolean[] id_private;

   public UseTracker() {
      super(id_byte[0], id_byte[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_protected[0]]);
      this.id_public();
      HashSet var5 = new HashSet();
      this.id_break[id_protected[1]] = var5;
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      this.id_public();
      Iterator var1 = ((Set)this.id_break[id_protected[6]]).iterator();
      if (var1.hasNext()) {
         rryO var2 = (rryO)var1.next();
         var2.id_class(id_private[6]);
      }
   }

   private void id_class(rhd_3 var1, rdn_3 var2) {
      rgN_2 var3 = new rgN_2(id_byte[2]);
      var3.id_class(rgF_2.GRAY).id_class(rrjZ_2.id_byte((an_3)var1)).id_break(id_byte[3]).id_class(this.id_class(var2).id_break(rgF_2.RED));
      rrfu_3.id_class((rVi_1)var3);
   }

   private rVi_1 id_class(rdn_3 var1) {
      if (var1.id_this()) {
         rVi_1 var2 = new rgN_2(id_byte[8]).id_break(rgF_2.GOLD).id_break(jI_2.id_class(id_byte[9], var1.id_finally())).id_break(id_byte[10]);
         return var1.id_continue().id_case().id_break(id_byte[11]).id_class(var2);
      } else {
         return new rgN_2(jI_2.id_class(id_byte[12], var1.id_finally()));
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rvt_3 var3) {
         rqA_2 var4 = var3.id_break();
         if (var4 == rqn_3.hn) {
            this.id_this();
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1290568346;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_public();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[2]]) {
         for (cG_2 var3 : ((gm_3)id_import.id_class[id_protected[3]]).id_continue()) {
            if (rrff_3.id_class(var3)) {
               rdn_3 var4 = var3.sX();
               int var5 = var3.SH();
               if (!var4.id_class() && var5 == id_catch[0]) {
                  if (var4.id_break() == rdy_3.JA) {
                     this.id_break(var3, var4);
                  } else {
                     ((Set)this.id_break[id_protected[4]]).add(new rryO(var3, var4));
                  }
               }
            }
         }

         Iterator var6 = ((Set)this.id_break[id_protected[5]]).iterator();

         while (var6.hasNext()) {
            rryO var7 = (rryO)var6.next();
            rhd_3 var8 = var7.id_protected();
            rdn_3 var9 = var7.id_class();
            if (rqR_2.id_break() - var7.id_break() > id_throws[0]) {
               var6.remove();
            } else if (var7.id_byte()) {
               this.id_class(var8, var9);
               var6.remove();
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2759041638784309124L;
   }

   private void id_break(rhd_3 var1, rdn_3 var2) {
      rgN_2 var3 = new rgN_2(id_byte[4]);
      rgN_2 var4 = new rgN_2(id_byte[5]);
      var3.id_class(rgF_2.GRAY).id_class(rrjZ_2.id_byte((an_3)var1)).id_break(id_byte[6]).id_class(this.id_class(var2).id_break(rgF_2.RED));
      List var5 = rAB.id_class(var2);
      if (!var5.isEmpty()) {
         boolean var6 = id_private[0];

         for (int var7 = id_private[1]; var7 < var5.size(); var7++) {
            rLY var8 = (rLY)var5.get(var7);
            if (var8.id_break() > 0) {
               var4.id_break(rgF_2.GRAY + " • ").id_break(rgF_2.RED + rAB.id_class(var8, rgF_2.GRAY));
               if (var7 != var5.size() - id_private[2]) {
                  var4.id_break(id_byte[7]);
               }

               var6 = id_private[3];
            }
         }

         if (var6) {
            var3.id_class(var4);
         }
      }

      rrfu_3.id_class((rVi_1)var3);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{94, -46, 38, -120, 93, -68, -107, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_private = new boolean[]{false, false, true, true, false, false, true, true};
   }

   private static void id_else() {
      id_throws = new long[]{300L};
   }

   private static void id_new() {
      id_protected = new short[]{4, 0, 0, 56, 0, 0, 0};
   }

   private static void id_return() {
      id_catch = new byte[]{2};
   }

   private static void id_super() {
      id_byte = new String[]{
         new String("Use Tracker"),
         new String("Отслеживает использование\nпредметов"),
         new String(""),
         new String(" использовал "),
         new String(""),
         new String("\n"),
         new String(" выпил "),
         new String("\n"),
         new String("("),
         new String("ru_ru"),
         new String(")"),
         new String(" "),
         new String("ru_ru")
      };
   }

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }
}
