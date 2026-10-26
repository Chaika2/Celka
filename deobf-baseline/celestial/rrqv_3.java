package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqv_3 implements rrqd_3 {
   private static String[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_break = new short[]{0, 2000, 2000, 0, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000};
   }

   static {
      ntfClinit();
   }

   public String id_class(rrqz_3 var1) {
      return "'" + var1.id_byte().id_native().getString() + "'";
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2195071498924816906L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-86, 61, 127, 64, 35, 118, -107, 9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new boolean[]{false, false, false, true, false, true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2146429053;
   }

   @Override
   public void id_class(Collection<rrqz_3> var1) {
      if (var1.isEmpty()) {
         String var9 = id_class[18];
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[16]]).id_class(new rrtd_3(id_class[19], var9, id_break[17]));
         rrfu_3.id_byte(var9);
         MinecraftAccessor.a_("X-Ray: " + var9, id_byte[0]);
      } else {
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[18]]).id_class(new rrtd_3(id_class[20], id_class[21], id_break[19]));
         MinecraftAccessor.a_(id_class[22], id_byte[1]);
         HashMap var2 = new HashMap();
         rgN_2 var3 = new rgN_2(rgF_2.GRAY + "Сканирование завершено, найдено:\n");

         for (rrqz_3 var5 : var1) {
            String var6 = var5.id_byte().id_native().getString();
            var2.put(var6, var2.getOrDefault(var6, Integer.valueOf(id_byte[2])) + id_byte[3]);
         }

         int var10 = id_byte[4];

         for (Entry var12 : var2.entrySet()) {
            String var7 = (String)var12.getKey();
            Integer var8 = (Integer)var12.getValue();
            var3.id_break(rgF_2.GRAY + "- " + rgF_2.WHITE + var7).id_break(id_class[23]).id_break(rgF_2.RED + "x" + var8);
            if (var10 != var2.size() - id_byte[5]) {
               var3.id_break(id_class[24]);
            }

            var10++;
         }

         rrfu_3.id_class((rVi_1)var3);
      }
   }

   @Override
   public void id_class(rrqz_3 var1, boolean var2) {
      String var3 = this.id_class(var1) + (var2 ? id_class[0] : id_class[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[0]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_class[2], var3, id_break[1]) : new rrtx_3(id_class[3], var3, id_break[2])));
      rrfu_3.id_byte(var3);
   }

   @Override
   public void id_class(String var1, Exception var2) {
      String var3 = "'" + var1 + "'";
      String var4 = "Ошибка при добавлении " + var3;
      if (var2 instanceof u_1 var5 && var5.getMessage().equals(id_class[4])) {
         var4 = "Блок " + var3 + " не найден или является воздухом";
      }

      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[3]]).id_class(new rrtx_3(id_class[5], var4, id_break[4]));
      rrfu_3.id_byte(var4);
   }

   @Override
   public void id_break(rrqz_3 var1, boolean var2) {
      String var3 = this.id_class(var1) + (var2 ? id_class[6] : id_class[7]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[5]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_class[8], var3, id_break[6]) : new rrtx_3(id_class[9], var3, id_break[7])));
      rrfu_3.id_byte(var3);
   }

   private static void id_protected() {
      id_class = new String[]{
         new String(" добавлен в список"),
         new String(" уже есть в списке"),
         new String("X-Ray"),
         new String("X-Ray"),
         new String("Block not found"),
         new String("X-Ray"),
         new String(" удалён из списка"),
         new String(" не найден в списке"),
         new String("X-Ray"),
         new String("X-Ray"),
         new String("Список блоков очищен"),
         new String("X-Ray"),
         new String("Список блоков пуст"),
         new String("X-Ray"),
         new String("X-Ray"),
         new String("возобновлён"),
         new String("остановлен"),
         new String("X-Ray"),
         new String("Сканирование завершено"),
         new String("X-Ray"),
         new String("X-Ray"),
         new String("Сканирование завершено"),
         new String("X-Ray: Сканирование завершено"),
         new String(" "),
         new String("\n")
      };
   }

   @Override
   public void a_(String var1) {
      String var2 = "'" + var1 + "' не найден в списке";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[12]]).id_class(new rrtx_3(id_class[14], var2, id_break[13]));
      rrfu_3.id_byte(var2);
   }

   @Override
   public void g_(boolean var1) {
      String var2 = "X-Ray был " + (var1 ? id_class[15] : id_class[16]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[14]]).id_class(new rrtd_3(id_class[17], var2, id_break[15]));
      rrfu_3.id_byte(var2);
   }

   @Override
   public void g_() {
      String var1 = id_class[10];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[8]]).id_class(new rrtQ_2(id_class[11], var1, id_break[9]));
      rrfu_3.id_byte(var1);
   }

   @Override
   public void f_() {
      String var1 = id_class[12];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[10]]).id_class(new rrtx_3(id_class[13], var1, id_break[11]));
      rrfu_3.id_byte(var1);
   }
}
