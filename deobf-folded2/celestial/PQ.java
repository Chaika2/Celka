package celestial;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum PQ {
   private static boolean[] booleansbab060a493723b199065fc02333b4856;
   private static String[] stringsbab060a493723b199065fc02333b4856;

   static {
      ntfClinit();
   }

   private static void id_class() {
      stringsbab060a493723b199065fc02333b4856 = new String[]{new String(",(?=[^,]*->)"), new String(","), new String("->")};
   }

   @Override
   public boolean id_class(Type var1) {
      return Map.class.isAssignableFrom(Pc_1.id_class(var1));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7875803880347616302L;
   }

   @Override
   public Object id_class(PN var1, String var2) {
      Type var3 = ((ParameterizedType)var1.id_class().id_throws()).getActualTypeArguments()[0];
      Type var4 = ((ParameterizedType)var1.id_class().id_throws()).getActualTypeArguments()[1];
      PW var5 = PW.id_break(var3);
      PW var6 = PW.id_break(var4);
      return Stream.of(var2.split(",(?=[^,]*->)"))
         .map(var0 -> var0.split("->"))
         .collect(Collectors.toMap(var2x -> var5.id_class(var1, var2x[0]), var2x -> var6.id_class(var1, var2x[1])));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -704663813;
   }

   @Override
   public String id_class(PN var1, Object var2) {
      Type var3 = ((ParameterizedType)var1.id_class().id_throws()).getActualTypeArguments()[0];
      Type var4 = ((ParameterizedType)var1.id_class().id_throws()).getActualTypeArguments()[1];
      PW var5 = PW.id_break(var3);
      PW var6 = PW.id_break(var4);
      return ((Map)var2)
         .entrySet()
         .stream()
         .map(var3x -> var5.id_class(var1, var3x.getKey()) + "->" + var6.id_class(var1, var3x.getValue()))
         .collect(Collectors.joining(","));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-117, 47, -58, -60, -8, 54, -110, 50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      booleansbab060a493723b199065fc02333b4856 = new boolean[]{false, true, false, true, true, false};
   }
}
