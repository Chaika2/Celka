package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrNO extends Pv_1 implements MinecraftAccessor {
   private static byte[] id_byte;
   private static String[] id_protected;
   public Object[] id_break;
   private static double[] id_throws;
   private static short[] id_case;
   private static boolean[] id_catch;

   public void id_byte() throws IllegalStateException {
      this.id_break(!this.id_private() ? true : id_catch[11]);
   }

   private static void id_int() {
      id_protected = new String[]{new String("Нельзя включить покупку, пока активен парсер"), new String("Нельзя включить парсер, пока активна покупка")};
   }

   public rrNO(C_class var1, rrfq_3... var2) {
      super(var1);
      this.id_new();
      Set var7 = Set.of(var2);
      this.id_break[id_case[0]] = var7;
   }

   static {
      ntfClinit();
   }

   public List<LZ> id_class(Fu_1<?> var1, String var2, int var3, int var4, int var5) {
      return null;
   }

   public void id_class(Fu_1<?> var1, rrNV var2) {
   }

   public void id_class(boolean var1) {
      this.id_new();
      if (var1 && this.id_private()) {
         throw new IllegalStateException(id_protected[0]);
      } else {
         Boolean var6 = var1;
         this.id_break[1] = var6;
         if ((Boolean)this.id_break[1]) {
            this.id_protected();
         } else {
            this.id_class();
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5670072928212234382L;
   }

   public void id_class() {
   }

   public int id_class(int var1, int var2) {
      double var3 = ((Qw_1)id_import.id_class[20]).rS;
      return (int)((double)var1 * (1.0 - var3 / 100.0) / (double)var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 377425424;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, 35, -92, -15, 53, -22, -113, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break(boolean var1) throws IllegalStateException {
      this.id_new();
      if (this.id_case() && var1) {
         throw new IllegalStateException(id_protected[1]);
      } else {
         Boolean var6 = var1;
         this.id_break[2] = var6;
         if ((Boolean)this.id_break[2]) {
            this.id_throws();
         } else {
            this.id_extends();
         }
      }
   }

   public boolean id_break() {
      return (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] ? true : id_catch[1];
   }

   public void id_throws() {
   }

   public Set<rrfq_3> id_finally() {
      this.id_new();
      return (Set<rrfq_3>)this.id_break[id_case[16]];
   }

   public void id_catch() {
      this.id_new();
      if ((Boolean)this.id_break[1]) {
         this.id_class(id_catch[12]);
      }

      if ((Boolean)this.id_break[2]) {
         this.id_break(id_catch[13]);
      }
   }

   public void id_extends() {
   }

   public boolean id_case() {
      this.id_new();
      if (!(Boolean)this.id_break[1]) {
         return id_catch[2];
      } else {
         rrfq_3 var1 = (rrfq_3)rrfp_3.id_class[1];
         return var1 != null && ((Set)this.id_break[id_case[5]]).contains(var1) ? true : id_catch[3];
      }
   }

   private static void id_continue() {
      id_throws = new double[]{1.0, 100.0};
   }

   public void id_implements() throws IllegalStateException {
      this.id_class(!this.id_case() ? true : id_catch[9]);
   }

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
         var1[1] = id_catch[15];
         var1[2] = id_catch[16];
      }
   }

   private static void id_package() {
      id_byte = new byte[]{3, 2};
   }

   private static void id_super() {
      id_catch = new boolean[]{true, false, false, false, true, false, false, true, true, false, true, false, false, false, true, false, false};
   }

   public void id_protected() {
   }

   public boolean id_private() throws IllegalStateException {
      this.id_new();
      if (!(Boolean)this.id_break[2]) {
         return id_catch[5];
      } else {
         rrfq_3 var1 = (rrfq_3)rrfp_3.id_class[1];
         return var1 != null && ((Set)this.id_break[id_case[8]]).contains(var1) ? true : id_catch[6];
      }
   }

   private static void id_final() {
      id_case = new short[]{0, 1, 2, 1, 1, 0, 2, 1, 0, 20, 1, 1, 2, 2, 1, 2, 0};
   }
}
