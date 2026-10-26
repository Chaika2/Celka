package celestial;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum Pz_1 {
   private static String[] strings5ff9f1b2215d36c898aa3528e9a4bba3;
   private static boolean[] booleans5ff9f1b2215d36c898aa3528e9a4bba3;

   static {
      ntfClinit();
   }

   private static void id_class() {
      strings5ff9f1b2215d36c898aa3528e9a4bba3 = new String[]{new String(","), new String(",")};
   }

   @Override
   public boolean id_class(Type var1) {
      return List.class.isAssignableFrom(Pc_1.id_class(var1));
   }

   @Override
   public Object id_class(PN var1, String var2) {
      Type var3 = ((ParameterizedType)var1.id_class().id_throws()).getActualTypeArguments()[0];
      PW var4 = PW.id_break(var3);
      return Stream.of(var2.split(",")).map(var2x -> var4.id_class(var1, var2x)).collect(Collectors.toList());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 631898525237843566L;
   }

   @Override
   public String id_class(PN var1, Object var2) {
      Type var3 = ((ParameterizedType)var1.id_class().id_throws()).getActualTypeArguments()[0];
      PW var4 = PW.id_break(var3);
      return ((List)var2).stream().map(var2x -> var4.id_class(var1, var2x)).collect(Collectors.joining(","));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1825991493;
   }

   private static void id_break() {
      booleans5ff9f1b2215d36c898aa3528e9a4bba3 = new boolean[2];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, 33, 56, 83, 91, -108, -1, -80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
