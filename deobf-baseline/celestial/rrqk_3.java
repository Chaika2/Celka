package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqk_3 extends rrqN_2 {
   private static byte[] id_byte;
   private static float[] id_protected;
   private static String[] id_case;
   private static boolean[] id_catch;
   public Object[] id_class;
   private static short[] id_private;

   public Comparator<rja_3> id_byte() {
      this.id_this();
      return (Comparator<rja_3>)this.id_class[id_private[34]];
   }

   private static void id_int() {
      id_case = new String[]{
         new String("Сканирование..."), new String("Готово!"), new String("Остановлен"), new String("Добавьте блоки через команду '.xray'")
      };
   }

   public rrqk_3(XRay<?> var1) {
      super(var1);
      this.id_this();
      ArrayList var6 = new ArrayList();
      this.id_class[id_private[0]] = var6;
      rrqW_2 var7 = new rrqW_2();
      this.id_class[id_private[1]] = var7;
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[3] = 0;
         this.id_class[4] = 0;
         this.id_class[5] = false;
      }
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_continue().id_byte(id_catch[1]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -643653164366629159L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, 97, 72, 65, -45, 78, -45, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_this();
      Ml_1 var2 = var1.id_class();
      Qg_1 var3 = id_import.id_else();
      rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_private[8]]).id_class();
      String var5 = rrfu_3.id_class(this.id_continue()) + (Integer)this.id_class[id_private[9]] + " / " + (Integer)this.id_class[id_private[10]];
      String var6 = id_case[0];
      if ((Boolean)this.id_class[id_private[11]]) {
         var6 = id_case[1];
      } else if (!this.id_continue().id_continue()) {
         var6 = id_case[2];
      }

      int var7 = (int)(var3.id_volatile() / id_protected[0]);
      int var8 = (int)(var3.id_final() / id_protected[1] + id_protected[2]);
      var4.id_class(var2, var5, (float)var7, (float)var8, rrZF.d_, id_catch[4]);
      var4.id_class(var2, var6, (double)((float)var7 - var4.id_break(var6) / id_protected[3]), (double)(var8 + id_byte[0]), id_byte[1], id_private[12]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -837448356;
   }

   public void id_class(float var1) {
      this.id_this();
      if ((cb_3)id_import.id_class[id_private[17]] != null && (gm_3)id_import.id_class[id_private[18]] != null) {
         ((List)this.id_class[id_private[19]]).clear();
         rrjc_3.id_class(this::id_class, (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[id_private[20]], var1).forEach(var1x -> {
            this.id_this();
            ((List)this.id_class[id_private[39]]).add(new rja_3(var1x.b_(), var1x.c_(), var1x.d_()));
         });
         ((List)this.id_class[id_private[21]]).sort(new rrqW_2());
         Integer var6 = ((List)this.id_class[id_private[22]]).size();
         this.id_class[id_private[23]] = var6;
      }
   }

   private boolean id_class(rfH_2 var1) {
      return !((gm_3)id_import.id_class[id_private[27]]).id_instanceof().id_class(var1) ? id_catch[11] : id_catch[12];
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_this();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[2]]
         && (Integer)this.id_class[id_private[3]] == (Integer)this.id_class[id_private[4]]
         && !(Boolean)this.id_class[id_private[5]]) {
         ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_private[6]]).id_class(this.id_final().stream().map(var0 -> var0.id_class()).toList());
         Boolean var6 = id_catch[3];
         this.id_class[id_private[7]] = var6;
      }
   }

   public void id_class(rja_3 var1) {
      this.id_this();
      this.id_class[id_private[15]] = var1;
   }

   public void id_class() {
      this.id_this();
      Integer var5 = (Integer)this.id_class[id_private[13]] + id_catch[7];
      this.id_class[id_private[14]] = var5;
   }

   @Override
   public void id_class(rrAM var1) {
      super.id_class(var1);
      this.id_continue().id_byte(id_catch[0]);
   }

   @EventTarget
   public void id_class(rrLM var1) {
      this.id_continue().id_byte(id_catch[2]);
   }

   @Override
   public void id_break(rrqz_3 var1, boolean var2) {
      if (var2) {
         this.id_return();
      }
   }

   public boolean id_finally() {
      this.id_this();
      return (Boolean)this.id_class[id_private[38]];
   }

   public List<rja_3> id_extends() {
      this.id_this();
      return (List<rja_3>)this.id_class[id_private[33]];
   }

   public rja_3 id_case() {
      this.id_this();
      return (rja_3)this.id_class[id_private[35]];
   }

   private static void id_else() {
      id_protected = new float[]{2.0F, 2.0F, 20.0F, 2.0F};
   }

   public int id_implements() {
      this.id_this();
      return (Integer)this.id_class[id_private[36]];
   }

   private static void id_new() {
      id_private = new short[]{
         0, 1, 0, 4, 3, 5, 0, 5, 0, 4, 3, 5, 255, 4, 4, 2, 0, 57, 56, 0, 0, 0, 0, 3, 3, 4, 5, 56, 57, 56, 0, 0, 2000, 0, 1, 2, 3, 4, 5, 0
      };
   }

   private boolean id_return() {
      XRay var1 = this.id_continue();
      if ((cb_3)id_import.id_class[id_private[28]] == null || (gm_3)id_import.id_class[id_private[29]] == null || !var1.aJ_()) {
         return id_catch[13];
      } else if (((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_private[30]]).id_break().isEmpty()) {
         var1.id_byte(id_catch[14]);
         String var2 = id_case[3];
         rrfu_3.id_byte(rrfu_3.id_class((Module)var1) + var2);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_private[31]]).id_class(new rrtx_3(var1.id_final(), var2, id_private[32]));
         return id_catch[15];
      } else {
         return id_catch[16];
      }
   }

   private static void id_public() {
      id_byte = new byte[]{10, 15, 6, 3, 4, 5};
   }

   public int id_protected() {
      this.id_this();
      return (Integer)this.id_class[id_private[37]];
   }

   public void id_private() {
      this.id_this();
      ((List)this.id_class[id_private[16]]).clear();
   }

   private static void id_synchronized() {
      id_catch = new boolean[]{
         false, false, false, true, false, true, false, true, false, false, false, false, true, false, false, true, false, false, false, false
      };
   }

   @Override
   public void id_native() {
      this.id_this();
      super.id_native();
      this.id_private();
      this.id_package();
      this.id_class(null);
      Integer var5 = Integer.valueOf(id_catch[8]);
      this.id_class[id_private[24]] = var5;
      Integer var6 = Integer.valueOf(id_catch[9]);
      this.id_class[id_private[25]] = var6;
      Boolean var7 = id_catch[10];
      this.id_class[id_private[26]] = var7;
   }

   @Override
   public boolean aI_() {
      boolean var1 = super.aI_() && !this.id_return() ? id_catch[5] : id_catch[6];
      if (var1) {
         this.id_class(this.id_continue().id_else().id_byte());
      }

      return var1;
   }

   @Override
   public void g_() {
      this.id_return();
   }
}
