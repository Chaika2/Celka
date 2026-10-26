package celestial;

import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class rrxF_2 {
   private xc_3 id_class;
   private rfH_2 id_break;
   private int id_byte = -1;
   private int id_protected = -1;
   private int id_throws = -1;
   private int id_case = -1;
   private float[] id_catch = new float[rpr_3.VALUES.length * 2];
   private BitSet id_private = new BitSet(3);
   private lw_3 id_implements = new lw_3();
   private rrGi_1 id_finally = null;
   private boolean[] id_extends = null;
   private boolean[] id_native = null;
   private boolean[] id_volatile = null;
   private rpr_3[] id_final = null;
   private List<wK_2> id_package = new ArrayList<>();
   private List<wK_2> id_int = new ArrayList<>();
   private wK_2[] id_new = new wK_2[1];
   private wK_2[] id_continue = new wK_2[2];
   private wK_2[] id_super = new wK_2[3];
   private wK_2[] id_this = new wK_2[4];
   private Hv_1 id_else = null;
   private rrJp_1[] id_synchronized = new rrJp_1[HU.s.length];
   private boolean id_return = false;
   private Long2ByteLinkedOpenHashMap id_public = new Long2ByteLinkedOpenHashMap();
   private static final int id_goto = -1;
   private static final int id_while = 0;
   private static final int id_try = 1;

   public float[] id_byte() {
      return this.id_catch;
   }

   public boolean id_int() {
      return this.id_return;
   }

   public rrxF_2(xc_3 var1, rfH_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public wK_2[] id_class(wK_2 var1, wK_2 var2) {
      this.id_continue[0] = var1;
      this.id_continue[1] = var2;
      return this.id_continue;
   }

   public void id_class(xc_3 var1, rfH_2 var2) {
      if (this.id_class != var1 || this.id_break != var2) {
         this.id_class = var1;
         this.id_break = var2;
         this.id_byte = -1;
         this.id_protected = -1;
         this.id_throws = -1;
         this.id_case = -1;
         this.id_private.clear();
      }
   }

   public List<wK_2> id_class(wK_2[] var1) {
      this.id_int.clear();
      if (var1 != null) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            wK_2 var3 = var1[var2];
            this.id_int.add(var3);
         }
      }

      return this.id_int;
   }

   public void id_class(Hv_1 var1) {
      this.id_else = var1;
   }

   public rpr_3[] id_class(rpr_3 var1, rpr_3 var2, rpr_3 var3, rpr_3 var4) {
      rpr_3[] var5 = this.id_native();
      var5[0] = var1;
      var5[1] = var2;
      var5[2] = var3;
      var5[3] = var4;
      return var5;
   }

   public rrJp_1 id_class(HU var1) {
      rrJp_1 var2 = this.id_synchronized[var1.id_protected()];
      if (var2 == null) {
         var2 = new rrJp_1();
         this.id_synchronized[var1.id_protected()] = var2;
      }

      return var2;
   }

   public wK_2[] id_class(wK_2 var1, wK_2 var2, wK_2 var3) {
      this.id_super[0] = var1;
      this.id_super[1] = var2;
      this.id_super[2] = var3;
      return this.id_super;
   }

   public void id_class(boolean var1) {
      this.id_return = var1;
   }

   public int id_class() {
      if (this.id_byte < 0) {
         this.id_byte = this.id_class.id_continue();
      }

      return this.id_byte;
   }

   public wK_2[] id_class(wK_2 var1, wK_2 var2, wK_2 var3, wK_2 var4) {
      this.id_this[0] = var1;
      this.id_this[1] = var2;
      this.id_this[2] = var3;
      this.id_this[3] = var4;
      return this.id_this;
   }

   public boolean id_class(List var1) {
      if (this.id_throws == -1 && var1.size() > 0) {
         if (var1.get(0) instanceof rrJl_1) {
            this.id_throws = 1;
         } else {
            this.id_throws = 0;
         }
      }

      return this.id_throws == 1;
   }

   public boolean id_class(wK_2 var1) {
      if (this.id_throws < 0) {
         if (var1 instanceof rrJl_1) {
            this.id_throws = 1;
         } else {
            this.id_throws = 0;
         }
      }

      return this.id_throws == 1;
   }

   public wK_2[] id_break(wK_2 var1) {
      this.id_new[0] = var1;
      return this.id_new;
   }

   public int id_break() {
      if (this.id_protected < 0) {
         this.id_protected = this.id_class.id_super();
      }

      return this.id_protected;
   }

   public lw_3 id_throws() {
      return this.id_implements;
   }

   public boolean[] id_finally() {
      if (this.id_native == null) {
         this.id_native = new boolean[4];
      }

      return this.id_native;
   }

   public xc_3 id_catch() {
      return this.id_class;
   }

   public boolean[] id_extends() {
      if (this.id_volatile == null) {
         this.id_volatile = new boolean[4];
      }

      return this.id_volatile;
   }

   public boolean id_case() {
      return this.id_throws == 1;
   }

   public boolean[] id_implements() {
      if (this.id_extends == null) {
         this.id_extends = new boolean[4];
      }

      return this.id_extends;
   }

   public Long2ByteLinkedOpenHashMap id_new() {
      return this.id_public;
   }

   public Hv_1 id_package() {
      return this.id_else;
   }

   public BitSet id_protected() {
      return this.id_private;
   }

   public rrGi_1 id_private() {
      if (this.id_finally == null) {
         this.id_finally = new rrGi_1(0, 0, 0);
      }

      return this.id_finally;
   }

   public List<wK_2> id_final() {
      return this.id_package;
   }

   public boolean id_volatile() {
      if (this.id_case == -1) {
         if (rrbb_3.id_static() && this.id_class.id_break() instanceof kZ_2) {
            this.id_case = 1;
         } else {
            this.id_case = 0;
         }
      }

      return this.id_case == 1;
   }

   public rpr_3[] id_native() {
      if (this.id_final == null) {
         this.id_final = new rpr_3[4];
      }

      return this.id_final;
   }
}
