package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmh_3 extends C_try {
   private static short[] id_break;
   private static String[] id_throws;
   private static byte[] id_case;
   private static boolean[] id_catch;

   public rrmh_3(C_case var1) {
      String[] var10002 = new String[id_catch[0]];
      var10002[id_catch[1]] = id_throws[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1653639930781242178L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 7557732;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      for (int var3 = id_catch[2]; var3 < id_case[0]; var3++) {
         rdn_3 var4 = ((rhz_3)((cb_3)b_.id_class[id_break[0]]).id_implements[id_break[1]]).id_extends(var3);
         if (!var4.id_class()) {
            ((Ax_1)b_.id_class[id_break[2]]).id_class(id_catch[3], rrfY_2.id_break(var3), id_case[1], rXa_1.SWAP, id_catch[4]);
         }
      }

      if (!((rhz_3)((cb_3)b_.id_class[id_break[3]]).id_implements[id_break[4]]).id_break.get(id_catch[5]).id_class()) {
         ((Ax_1)b_.id_class[id_break[5]]).id_class(id_catch[6], id_case[2], id_case[3], rXa_1.SWAP, id_catch[7]);
      }

      if (!((rhz_3)((cb_3)b_.id_class[id_break[6]]).id_implements[id_break[7]]).id_break.get(id_catch[8]).id_class()) {
         ((Ax_1)b_.id_class[id_break[8]]).id_class(id_catch[9], id_case[4], id_case[5], rXa_1.SWAP, id_catch[10]);
      }

      if (!((rhz_3)((cb_3)b_.id_class[id_break[9]]).id_implements[id_break[10]]).id_break.get(id_case[6]).id_class()) {
         ((Ax_1)b_.id_class[id_break[11]]).id_class(id_catch[11], id_case[7], id_case[8], rXa_1.SWAP, id_catch[12]);
      }

      if (!((rhz_3)((cb_3)b_.id_class[id_break[12]]).id_implements[id_break[13]]).id_break.get(id_case[9]).id_class()) {
         ((Ax_1)b_.id_class[id_break[14]]).id_class(id_catch[13], id_case[10], id_case[11], rXa_1.SWAP, id_catch[14]);
      }

      if (!((cb_3)b_.id_class[id_break[15]]).Sn().id_class()) {
         ((Ax_1)b_.id_class[id_break[16]]).id_class(id_catch[15], id_case[12], id_case[13], rXa_1.SWAP, id_catch[16]);
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[17]]).id_finally().id_class(rrLY.id_class());
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-5, -4, 2, -96, 46, 2, 107, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new String[]{new String("cleaninv"), new String("Команда для очистки инвентаря"), new String("> %s%s")};
   }

   private static void id_finally() {
      id_catch = new boolean[]{
         true, false, false, false, true, false, false, true, true, false, true, false, true, false, true, false, true, false, false, true
      };
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(id_catch[17]);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[id_break[18]];
      String var10000 = id_throws[2];
      Object[] var10001 = new Object[id_case[14]];
      var10001[id_catch[18]] = var2;
      var10001[id_catch[19]] = var1;
      return List.of(var10000.formatted(var10001));
   }

   private static void id_extends() {
      id_break = new short[]{57, 1, 55, 57, 1, 55, 57, 1, 55, 57, 1, 55, 57, 1, 55, 57, 55, 0, 0};
   }

   @Override
   public String id_implements() {
      return id_throws[1];
   }

   private static void id_protected() {
      id_case = new byte[]{36, 45, 8, 45, 7, 45, 2, 6, 45, 3, 5, 45, 45, 45, 2};
   }
}
