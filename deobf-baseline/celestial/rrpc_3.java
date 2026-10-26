package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpc_3 extends rrTF<FtHelper> {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static String[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   public rrpc_3(FtHelper var1, GroupSetting var2) {
      super(var1);
      this.id_byte();
      rrIF var7 = new rrIF(
         id_protected[0],
         (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_byte[0]],
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_byte[1]]).id_finally(),
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_byte[2]]).id_finally()
      );
      this.id_class[id_byte[3]] = var7;
      var2.id_class((rrIF)this.id_class[id_byte[4]]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5365960446796320401L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 990039306;
   }

   private String id_class(rdn_3 var1) {
      String var2;
      if (var1.id_this()) {
         rgP_2 var3 = var1.id_continue();
         rVi_1 var4 = var3.id_throws();

         for (rgP_2 var6 : var3.id_protected()) {
            if (!var6.id_class().id_case()) {
               var4.id_class(var6);
            }
         }

         var2 = var4.id_byte();
      } else {
         var2 = jI_2.id_class(id_protected[1], var1.id_finally());
      }

      return var2.replace(id_protected[2], id_protected[3]).replaceAll(id_protected[4], id_protected[5]).trim();
   }

   @EventTarget
   public void id_class(rrLs_1 var1) {
      this.id_byte();
      int var2 = var1.id_protected();
      int var3 = var1.id_class();
      if (var3 == id_break[0] && var2 == ((rrIF)this.id_class[id_byte[5]]).id_finally().id_byte()) {
         rdn_3 var4 = null;
         vm_3 var6 = (vm_3)id_import.id_class[id_byte[6]];
         if (var6 instanceof Zg_1 var5) {
            var4 = var5.id_byte();
         } else if ((vm_3)id_import.id_class[id_byte[7]] == null) {
            var4 = ((cb_3)id_import.id_class[id_byte[8]]).ss();
         }

         if (var4 != null && !var4.id_class()) {
            this.id_break(var4);
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-107, -21, 71, -39, 60, -5, 104, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new short[]{0, 0, 0, 0, 0, 0, 73, 73, 57, 57, 0, 57, 4, 57};
   }

   private void id_break(rdn_3 var1) {
      String var2 = this.id_class(var1);
      if (rrfo_3.id_class()) {
         ((Aq_1)((cb_3)id_import.id_class[id_byte[9]]).id_break[id_byte[10]])
            .id_break(new rmj_3(((rJr_1)((cb_3)id_import.id_class[id_byte[11]]).id_implements[id_byte[12]]).id_case));
      }

      ((cb_3)id_import.id_class[id_byte[13]]).id_case("/ah search " + var2);
   }

   private static void id_break() {
      id_break = new boolean[]{true, false, true};
   }

   private static void id_protected() {
      id_protected = new String[]{
         new String("Открыть аукцион\nс предметом который\nна мышке либо в руке"),
         new String("ru_ru"),
         new String("ё"),
         new String("е"),
         new String("\\[?(\\d+[xх]\\d+)]?|[^a-zA-Zа-яА-Я- ]+"),
         new String("$1")
      };
   }
}
