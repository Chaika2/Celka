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
      String[] var10002 = new String[1];
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
      for (int var3 = id_catch[2]; var3 < 36; var3++) {
         rdn_3 var4 = ((rhz_3)((cb_3)b_.id_class[57]).id_implements[1]).id_extends(var3);
         if (!var4.id_class()) {
            ((Ax_1)b_.id_class[55]).id_class(id_catch[3], rrfY_2.id_break(var3), 45, rXa_1.SWAP, true);
         }
      }

      if (!((rhz_3)((cb_3)b_.id_class[57]).id_implements[1]).id_break.get(id_catch[5]).id_class()) {
         ((Ax_1)b_.id_class[55]).id_class(id_catch[6], 8, 45, rXa_1.SWAP, true);
      }

      if (!((rhz_3)((cb_3)b_.id_class[57]).id_implements[1]).id_break.get(1).id_class()) {
         ((Ax_1)b_.id_class[55]).id_class(id_catch[9], 7, 45, rXa_1.SWAP, true);
      }

      if (!((rhz_3)((cb_3)b_.id_class[57]).id_implements[1]).id_break.get(2).id_class()) {
         ((Ax_1)b_.id_class[55]).id_class(id_catch[11], 6, 45, rXa_1.SWAP, true);
      }

      if (!((rhz_3)((cb_3)b_.id_class[57]).id_implements[1]).id_break.get(3).id_class()) {
         ((Ax_1)b_.id_class[55]).id_class(id_catch[13], 5, 45, rXa_1.SWAP, true);
      }

      if (!((cb_3)b_.id_class[57]).Sn().id_class()) {
         ((Ax_1)b_.id_class[55]).id_class(id_catch[15], 45, 45, rXa_1.SWAP, true);
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
      Object[] var10001 = new Object[2];
      var10001[id_catch[18]] = var2;
      var10001[1] = var1;
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
