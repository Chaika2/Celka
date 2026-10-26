package celestial;

import java.util.function.IntConsumer;

public enum jL_2 {
   POSITION("Position", (var0, var1, var2, var3, var5) -> {
      MT.id_break(var0, var1, var2, var3);
      MT.id_public(32884);
   }, var0 -> MT.id_goto(32884)),
   NORMAL("Normal", (var0, var1, var2, var3, var5) -> {
      MT.id_class(var1, var2, var3);
      MT.id_public(32885);
   }, var0 -> MT.id_goto(32885)),
   COLOR("Vertex Color", (var0, var1, var2, var3, var5) -> {
      MT.id_byte(var0, var1, var2, var3);
      MT.id_public(32886);
   }, var0 -> {
      MT.id_goto(32886);
      MT.id_double();
   }),
   UV("UV", (var0, var1, var2, var3, var5) -> {
      MT.id_final(33984 + var5);
      MT.id_class(var0, var1, var2, var3);
      MT.id_public(32888);
      MT.id_final(33984);
   }, var0 -> {
      MT.id_final(33984 + var0);
      MT.id_goto(32888);
      MT.id_final(33984);
   }),
   PADDING("Padding", (var0, var1, var2, var3, var5) -> {
   }, var0 -> {
   }),
   GENERIC("Generic", (var0, var1, var2, var3, var5) -> {
      MT.id_while(var5);
      MT.id_class(var5, var0, var1, false, var2, var3);
   }, MT::id_try);

   private final String displayName;
   private final jA_2 setupState;
   private final IntConsumer clearState;

   private jL_2(String var3, jA_2 var4, IntConsumer var5) {
      this.displayName = var3;
      this.setupState = var4;
      this.clearState = var5;
   }

   public void id_class(int var1) {
      this.clearState.accept(var1);
   }

   void id_class(int var1, int var2, int var3, long var4, int var6) {
      this.setupState.setupBufferState(var1, var2, var3, var4, var6);
   }

   public String id_class() {
      return this.displayName;
   }
}
