package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryA extends rrTF<AutoDuel> {
   private static double[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static String[] id_protected;
   private static byte[] id_case;
   private static short[] id_catch;
   private static float[] id_private;

   private static void id_byte() {
      id_catch = new short[]{4, 0, 1, 2, 3, 0, 0, 3, 73, 0, 0, 3000, 0, 1, 57, 3, 1, 2, 55, 57, 4, 2, 0, 57, 0, 1, 2, 3, 3, 0};
   }

   public rryA(AutoDuel var1) {
      super(var1);
      this.id_private();
      rrIv_1 var6 = new rrIv_1(id_protected[0], id_protected[1], rrte_3.id_class((Pattern)rrtR_2.id_class[id_catch[0]])).id_class(id_private[0]);
      this.id_class[id_catch[1]] = var6;
      rrfw_3 var7 = new rrfw_3();
      this.id_class[id_catch[2]] = var7;
      rrfw_3 var8 = new rrfw_3();
      this.id_class[id_catch[3]] = var8;
      ArrayList var9 = new ArrayList();
      this.id_class[id_catch[4]] = var9;
      var1.id_class(((rrIv_1)this.id_class[id_catch[5]]).id_class(() -> var1.id_new() == this ? id_byte[14] : id_byte[15]));
   }

   static {
      ntfClinit();
   }

   private rdn_3 id_class(List<rdn_3> var1) {
      this.id_private();
      String var2 = ((rrIv_1)this.id_class[id_catch[22]]).id_extends();

      for (rdn_3 var4 : var1) {
         if (!var4.id_class() && var4.id_continue().id_byte().equalsIgnoreCase(var2)) {
            return var4;
         }
      }

      return null;
   }

   @EventTarget
   public void id_class(rrns_3 var1) {
      this.id_private();
      AutoDuel var2 = this.id_continue();
      Fu_1 var3 = var1.id_class();
      String var4 = var1.id_case();
      if (var3 instanceof Fc_1 var5) {
         rqs_3 var6 = var5.G_().id_extends();
         boolean var7 = id_byte[2];
         byte var9 = id_case[0];
         switch (var4.hashCode()) {
            case -52109964:
               if (var4.equals(id_protected[2])) {
                  var9 = id_byte[3];
               }
               break;
            case 1748450204:
               if (var4.equals(id_protected[3])) {
                  var9 = id_byte[4];
               }
         }

         switch (var9) {
            case 0:
               var7 = id_byte[5];
               rdn_3 var11 = this.id_class(var6);
               if (var11 != null) {
                  this.id_break(var6.indexOf(var11));
               } else {
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[9]])
                     .id_class(new rrtx_3(var2.id_final(), "Режим '" + ((rrIv_1)this.id_class[id_catch[10]]).id_extends() + "' не найден", id_catch[11]));
                  var2.id_byte(id_byte[6]);
               }
               break;
            case 1:
               var7 = id_byte[7];
               rdn_3 var10 = this.id_break(var6);
               if (var10 != null) {
                  this.id_break(var6.indexOf(var10));
               }
         }

         if (var7 && var5.id_throw() > id_case[1]) {
            id_import.id_break(null);
         }
      }
   }

   private List<String> id_class(boolean var1) {
      Predicate var2 = var1x -> {
         this.id_private();
         if (((List)this.id_class[id_catch[28]]).contains(var1x)) {
            return id_byte[10];
         } else if (var1x.equals(id_import.id_while().id_byte())) {
            return id_byte[11];
         } else {
            return ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_catch[29]]).id_break(var1x) ? id_byte[12] : id_byte[13];
         }
      };
      return uR_2.id_class((Aq_1)((cb_3)id_import.id_class[id_catch[23]]).id_break[id_catch[24]], var1)
         .stream()
         .map(var0 -> rql_3.id_class(var0.id_class().getName()))
         .filter(var2)
         .toList();
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_private();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[6]]) {
         List var2 = this.id_class(id_byte[0]);
         if (var2.isEmpty()) {
            ((List)this.id_class[id_catch[7]]).clear();
         }

         if (!var2.isEmpty() && !((vm_3)id_import.id_class[id_catch[8]] instanceof Fc_1)) {
            String var3 = (String)var2.get(id_byte[1]);
            this.id_break(var3);
         }
      }
   }

   @EventTarget
   public void id_class(rrFY var1) {
      this.id_continue().id_byte(id_byte[8]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1761182948;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{11, -125, -43, -16, 68, 68, -122, 103}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrFw_1 var1) {
      if (var1.id_class() == (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[id_catch[12]]) {
         this.id_continue().aw_();
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8057961746786261384L;
   }

   @EventTarget
   public void id_class(rrAl_1 var1) {
      if (var1.id_class() > id_private[1]) {
         this.id_continue().aw_();
      }
   }

   private static void id_class() {
      id_private = new float[]{80.0F, 10.0F};
   }

   private rdn_3 id_break(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         if (!var3.id_class() && var3.id_continue().id_byte().equalsIgnoreCase(id_protected[4])) {
            return var3;
         }
      }

      return null;
   }

   private void id_break(int var1) {
      this.id_private();
      if (((rrfw_3)this.id_class[id_catch[17]]).id_class(id_break[1])) {
         ((Ax_1)id_import.id_class[id_catch[18]])
            .id_break(((rJr_1)((cb_3)id_import.id_class[id_catch[19]]).id_implements[id_catch[20]]).id_case, var1, id_case[2], rXa_1.CLONE, id_byte[9]);
         ((rrfw_3)this.id_class[id_catch[21]]).id_class();
      }
   }

   private static void id_break() {
      id_byte = new boolean[]{true, false, false, false, true, true, false, true, true, true, false, false, false, true, true, false};
   }

   private void id_break(String var1) {
      this.id_private();
      if (((rrfw_3)this.id_class[id_catch[13]]).id_class(id_break[0])) {
         ((cb_3)id_import.id_class[id_catch[14]]).id_protected("/duel " + var1);
         ((List)this.id_class[id_catch[15]]).add(var1);
         ((rrfw_3)this.id_class[id_catch[16]]).id_class();
      }
   }

   private static void id_throws() {
      id_case = new byte[]{-1, 10, 2, 4};
   }

   private void id_case() {
      this.id_private();
      ((rrfw_3)this.id_class[id_catch[25]]).id_class();
      ((rrfw_3)this.id_class[id_catch[26]]).id_class();
      ((List)this.id_class[id_catch[27]]).clear();
   }

   private static void id_implements() {
      id_break = new double[]{200.0, 200.0};
   }

   private static void id_protected() {
      id_protected = new String[]{
         new String("Выбор режима"), new String("Тотемы"), new String("Выбор набора (1/1)"), new String("Настройка поединка"), new String("ОТПРАВИТЬ ЗАПРОС")
      };
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
      }
   }

   @Override
   public boolean aK_() {
      this.id_case();
      return super.aK_();
   }
}
