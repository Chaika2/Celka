package celestial;

import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class StaffViewer extends Module implements rrqJ_2, rrqO_2 {
   private static byte[] id_protected;
   public Object[] id_break;
   private static boolean[] id_throws;
   private static String[] id_catch;
   public static Object[] id_byte;
   private static short[] id_private;

   public StaffViewer() {
      super(id_catch[0], id_catch[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_private[0]]);
      this.id_public();
      HashSet var5 = new HashSet();
      this.id_break[id_private[1]] = var5;
      Ordering var6 = Ordering.from(new rrqb_3());
      this.id_break[id_private[2]] = var6;
      rrIk_1 var7 = new rrIk_1(id_catch[2], id_throws[0]);
      this.id_break[id_private[3]] = var7;
      ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_private[4]]).id_class(this);
      ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_private[5]]).id_class(this);
      this.id_class((rrIk_1)this.id_break[id_private[6]]);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_this() {
      this.id_case(id_throws[4]);
   }

   @Override
   public void id_class(String var1, boolean var2) {
      this.id_public();
      if (var2) {
         for (rrqr_3 var4 : (Set)this.id_break[id_private[11]]) {
            if (var4 instanceof rrqP_2 var5
               && var5.id_case().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[id_private[12]])
               && var5.id_class().id_class().getName().equalsIgnoreCase(var1)) {
               var4.id_class(id_throws[1]);
               break;
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 472127657;
   }

   private void id_class(Aw_1 var1) {
      this.id_public();
      if ((rrfq_3)rrfp_3.id_class[id_private[18]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_private[19]]) {
         if (var1 != null) {
            if (var1.id_class().getName().equalsIgnoreCase(id_import.id_while().id_byte().toLowerCase())) {
               return;
            }

            rnB_2 var2 = var1.id_implements();
            if (var2 == null) {
               return;
            }

            String var3 = var2.id_class();
            if (!var3.contains(id_catch[3]) && var3.startsWith(id_catch[4]) && var3.endsWith(id_catch[5])) {
               rrqP_2 var4 = new rrqP_2((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[id_private[20]], var1, var2.id_protected().id_byte());
               ((Set)this.id_break[id_private[21]]).add(var4);
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLL var1) {
      this.id_public();
      if ((gm_3)id_import.id_class[id_private[7]] != null) {
         Aw_1 var2 = var1.id_break();
         String var3 = var2.id_class().getName();
         String var4 = var1.id_class().id_byte();
         rrqB_2 var5 = rrqB_2.id_class(var2, var3, var4);
         this.id_class(var5, var2);
         this.id_class(var2);
         if (var5 != null) {
            rrqP_2 var6 = new rrqP_2(var5, var2, var4);
            ((Set)this.id_break[id_private[8]]).add(var6);
         }
      }
   }

   @EventTarget
   public void id_class(rrFV var1) {
      this.id_public();
      if (((rrIk_1)this.id_break[id_private[9]]).id_class()) {
         this.id_break(var1);
      }
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_public();
      ((Set)this.id_break[id_private[10]]).removeIf(var0 -> !var0.id_throws() ? id_throws[6] : id_throws[7]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -566492125520163404L;
   }

   private void id_class(rrqB_2 var1, Aw_1 var2) {
      this.id_public();
      if ((rrfq_3)rrfp_3.id_class[id_private[22]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_private[23]]) {
         if (var1 == null) {
            rnB_2 var3 = var2.id_implements();
            if (var3 == null) {
               return;
            }

            GameProfile var4 = var2.id_class();
            if (var4.getName().equalsIgnoreCase(id_import.id_while().id_byte().toLowerCase())) {
               return;
            }

            String var5 = var3.id_class();
            if (!var5.contains(id_catch[6]) && var5.startsWith(id_catch[7]) && var5.endsWith(id_catch[8])) {
               rrqP_2 var6 = new rrqP_2((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[id_private[24]], var2, var3.id_protected().id_byte());
               ((Set)this.id_break[id_private[25]]).add(var6);
            }
         }
      }
   }

   @Override
   public void id_break(String var1, boolean var2) {
      this.id_public();
      if (var2) {
         for (rrqr_3 var4 : (Set)this.id_break[id_private[13]]) {
            if (var4 instanceof rrqP_2) {
               rrqP_2 var5 = (rrqP_2)var4;
               if (var5.id_case().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[id_private[14]])
                  && var5.id_extends().toLowerCase().contains(var1.toLowerCase())) {
                  var5.id_class(id_throws[2]);
               }
            }
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-113, -102, -45, -29, -104, -89, -62, 9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break(rrFV var1) {
      rrqP_2 var2 = var1.id_byte();
      rrqS_2 var3 = var1.id_class();
      rrqS_2 var4 = var1.id_break();

      String var5 = switch (((int[])rrqG_2.id_class[id_private[26]])[var3.ordinal()]) {
         case 1 -> id_catch[13];
         case 2 -> id_catch[14];
         case 3 -> id_catch[15];
         case 4 -> {
            switch (((int[])rrqG_2.id_class[id_private[27]])[var4.ordinal()]) {
               case 1:
                  yield id_catch[9];
               case 2:
                  yield id_catch[10];
               case 3:
                  yield id_catch[11];
               default:
                  yield id_catch[12];
            }
         }
         case 5 -> id_catch[16];
         default -> null;
      };
      if (var5 != null) {
         rgN_2 var6 = new rgN_2(this.id_final());
         rVi_1 var7 = var2.id_implements().id_break(" " + var5);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_private[28]]).id_class(new rrtd_3(var6, var7, id_private[29]));
      }
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_public();
      super.id_throws(var1);

      for (rrqr_3 var3 : (Set)this.id_break[id_private[15]]) {
         if (!var3.id_throws()) {
            var3.id_class(id_throws[5]);
         }
      }
   }

   private static void id_goto() {
      Object[] var0 = new Object[]{rrfu_3.id_class().id_break(rVa_1.id_class(id_catch[17]), rVa_1.id_class(id_catch[18])).id_class(id_catch[19]).id_break()};
      id_byte = var0;
   }

   private void id_case(boolean var1) {
      this.id_public();

      for (rrqr_3 var3 : (Set)this.id_break[id_private[16]]) {
         if (var3 instanceof rrqP_2) {
            rrqP_2 var4 = (rrqP_2)var3;
            if (var4.id_case().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[id_private[17]])) {
               var4.id_class(var1);
            }
         }
      }
   }

   @Override
   public void id_continue() {
      this.id_case(id_throws[3]);
   }

   private static void id_else() {
      id_throws = new boolean[]{true, false, false, false, false, false, true, false, false, true};
   }

   public Set<rrqr_3> id_new() {
      this.id_public();
      return (Set<rrqr_3>)this.id_break[id_private[32]];
   }

   private static void id_return() {
      id_protected = new byte[]{3};
   }

   public List<rrqr_3> id_super() {
      this.id_public();
      return ((Ordering)this.id_break[id_private[30]]).sortedCopy((Set)this.id_break[id_private[31]]);
   }

   private static void id_try() {
      id_catch = new String[]{
         new String("Staff Viewer"),
         new String("Отображает активный персонал\nна сервере"),
         new String("Сообщать об изменении\nстатуса персонала"),
         new String("-"),
         new String("6"),
         new String("A"),
         new String("-"),
         new String("V"),
         new String("A"),
         new String("вышел из спека"),
         new String("вышел из GM3"),
         new String("ушёл от вас"),
         new String("в активном статусе"),
         new String("зашёл в спек"),
         new String("зашёл в GM3"),
         new String("рядом с вами"),
         new String("вышел с сервера"),
         new String("#ff0000"),
         new String("#ff7f7f"),
         new String("Персонал ")
      };
   }

   private static void id_while() {
      id_private = new short[]{2, 0, 1, 2, 0, 0, 2, 56, 0, 2, 0, 0, 10, 0, 10, 0, 0, 10, 1, 2, 3, 0, 1, 0, 3, 0, 0, 0, 0, 5000, 1, 0, 0};
   }

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
      }
   }
}
