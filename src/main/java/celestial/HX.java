/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.ARBDebugOutput
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLCapabilities
 *  org.lwjgl.opengl.GLDebugMessageARBCallback
 *  org.lwjgl.opengl.GLDebugMessageARBCallbackI
 *  org.lwjgl.opengl.GLDebugMessageCallback
 *  org.lwjgl.opengl.GLDebugMessageCallbackI
 *  org.lwjgl.opengl.KHRDebug
 */
package celestial;

import celestial.Hb_1;
import celestial.QY;
import celestial.cq_3;
import celestial.gs_3;
import celestial.jI_2;
import celestial.rgN_2;
import celestial.rrbb_3;
import celestial.rrbo_3;
import celestial.rrki_1;
import celestial.rrzQ_2;
import celestial.rrzX_2;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.ARBDebugOutput;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageARBCallback;
import org.lwjgl.opengl.GLDebugMessageARBCallbackI;
import org.lwjgl.opengl.GLDebugMessageCallback;
import org.lwjgl.opengl.GLDebugMessageCallbackI;
import org.lwjgl.opengl.KHRDebug;

public class HX {
    private static final Logger id_protected = LogManager.getLogger();
    protected static final ByteBuffer id_class = Hb_1.id_class(64);
    protected static final FloatBuffer id_break = id_class.asFloatBuffer();
    protected static final IntBuffer id_byte = id_class.asIntBuffer();
    private static final Joiner id_throws = Joiner.on((char)'\n');
    private static final Joiner id_case = Joiner.on((String)"; ");
    private static final Map<Integer, String> id_catch = Maps.newHashMap();
    private static final List<Integer> id_private = ImmutableList.of((Object)37190, (Object)37191, (Object)37192, (Object)33387);
    private static final List<Integer> id_implements = ImmutableList.of((Object)37190, (Object)37191, (Object)37192);
    private static final Map<String, List<String>> id_finally = Maps.newHashMap();
    private static final int[] id_extends = HX.id_class();

    private static String id_byte(int n) {
        switch (n) {
            case 33356: {
                return "ERROR";
            }
            case 33357: {
                return "DEPRECATED BEHAVIOR";
            }
            case 33358: {
                return "UNDEFINED BEHAVIOR";
            }
            case 33359: {
                return "PORTABILITY";
            }
            case 33360: {
                return "PERFORMANCE";
            }
            case 33361: {
                return "OTHER";
            }
            case 33384: {
                return "MARKER";
            }
        }
        return HX.id_class(n);
    }

    static {
        HX.id_class(256, "GL11.GL_ACCUM");
        HX.id_class(257, "GL11.GL_LOAD");
        HX.id_class(258, "GL11.GL_RETURN");
        HX.id_class(259, "GL11.GL_MULT");
        HX.id_class(260, "GL11.GL_ADD");
        HX.id_class(512, "GL11.GL_NEVER");
        HX.id_class(513, "GL11.GL_LESS");
        HX.id_class(514, "GL11.GL_EQUAL");
        HX.id_class(515, "GL11.GL_LEQUAL");
        HX.id_class(516, "GL11.GL_GREATER");
        HX.id_class(517, "GL11.GL_NOTEQUAL");
        HX.id_class(518, "GL11.GL_GEQUAL");
        HX.id_class(519, "GL11.GL_ALWAYS");
        HX.id_class(0, "GL11.GL_POINTS");
        HX.id_class(1, "GL11.GL_LINES");
        HX.id_class(2, "GL11.GL_LINE_LOOP");
        HX.id_class(3, "GL11.GL_LINE_STRIP");
        HX.id_class(4, "GL11.GL_TRIANGLES");
        HX.id_class(5, "GL11.GL_TRIANGLE_STRIP");
        HX.id_class(6, "GL11.GL_TRIANGLE_FAN");
        HX.id_class(7, "GL11.GL_QUADS");
        HX.id_class(8, "GL11.GL_QUAD_STRIP");
        HX.id_class(9, "GL11.GL_POLYGON");
        HX.id_class(0, "GL11.GL_ZERO");
        HX.id_class(1, "GL11.GL_ONE");
        HX.id_class(768, "GL11.GL_SRC_COLOR");
        HX.id_class(769, "GL11.GL_ONE_MINUS_SRC_COLOR");
        HX.id_class(770, "GL11.GL_SRC_ALPHA");
        HX.id_class(771, "GL11.GL_ONE_MINUS_SRC_ALPHA");
        HX.id_class(772, "GL11.GL_DST_ALPHA");
        HX.id_class(773, "GL11.GL_ONE_MINUS_DST_ALPHA");
        HX.id_class(774, "GL11.GL_DST_COLOR");
        HX.id_class(775, "GL11.GL_ONE_MINUS_DST_COLOR");
        HX.id_class(776, "GL11.GL_SRC_ALPHA_SATURATE");
        HX.id_class(32769, "GL14.GL_CONSTANT_COLOR");
        HX.id_class(32770, "GL14.GL_ONE_MINUS_CONSTANT_COLOR");
        HX.id_class(32771, "GL14.GL_CONSTANT_ALPHA");
        HX.id_class(32772, "GL14.GL_ONE_MINUS_CONSTANT_ALPHA");
        HX.id_class(1, "GL11.GL_TRUE");
        HX.id_class(0, "GL11.GL_FALSE");
        HX.id_class(12288, "GL11.GL_CLIP_PLANE0");
        HX.id_class(12289, "GL11.GL_CLIP_PLANE1");
        HX.id_class(12290, "GL11.GL_CLIP_PLANE2");
        HX.id_class(12291, "GL11.GL_CLIP_PLANE3");
        HX.id_class(12292, "GL11.GL_CLIP_PLANE4");
        HX.id_class(12293, "GL11.GL_CLIP_PLANE5");
        HX.id_class(5120, "GL11.GL_BYTE");
        HX.id_class(5121, "GL11.GL_UNSIGNED_BYTE");
        HX.id_class(5122, "GL11.GL_SHORT");
        HX.id_class(5123, "GL11.GL_UNSIGNED_SHORT");
        HX.id_class(5124, "GL11.GL_INT");
        HX.id_class(5125, "GL11.GL_UNSIGNED_INT");
        HX.id_class(5126, "GL11.GL_FLOAT");
        HX.id_class(5127, "GL11.GL_2_BYTES");
        HX.id_class(5128, "GL11.GL_3_BYTES");
        HX.id_class(5129, "GL11.GL_4_BYTES");
        HX.id_class(5130, "GL11.GL_DOUBLE");
        HX.id_class(0, "GL11.GL_NONE");
        HX.id_class(1024, "GL11.GL_FRONT_LEFT");
        HX.id_class(1025, "GL11.GL_FRONT_RIGHT");
        HX.id_class(1026, "GL11.GL_BACK_LEFT");
        HX.id_class(1027, "GL11.GL_BACK_RIGHT");
        HX.id_class(1028, "GL11.GL_FRONT");
        HX.id_class(1029, "GL11.GL_BACK");
        HX.id_class(1030, "GL11.GL_LEFT");
        HX.id_class(1031, "GL11.GL_RIGHT");
        HX.id_class(1032, "GL11.GL_FRONT_AND_BACK");
        HX.id_class(1033, "GL11.GL_AUX0");
        HX.id_class(1034, "GL11.GL_AUX1");
        HX.id_class(1035, "GL11.GL_AUX2");
        HX.id_class(1036, "GL11.GL_AUX3");
        HX.id_class(0, "GL11.GL_NO_ERROR");
        HX.id_class(1280, "GL11.GL_INVALID_ENUM");
        HX.id_class(1281, "GL11.GL_INVALID_VALUE");
        HX.id_class(1282, "GL11.GL_INVALID_OPERATION");
        HX.id_class(1283, "GL11.GL_STACK_OVERFLOW");
        HX.id_class(1284, "GL11.GL_STACK_UNDERFLOW");
        HX.id_class(1285, "GL11.GL_OUT_OF_MEMORY");
        HX.id_class(1536, "GL11.GL_2D");
        HX.id_class(1537, "GL11.GL_3D");
        HX.id_class(1538, "GL11.GL_3D_COLOR");
        HX.id_class(1539, "GL11.GL_3D_COLOR_TEXTURE");
        HX.id_class(1540, "GL11.GL_4D_COLOR_TEXTURE");
        HX.id_class(1792, "GL11.GL_PASS_THROUGH_TOKEN");
        HX.id_class(1793, "GL11.GL_POINT_TOKEN");
        HX.id_class(1794, "GL11.GL_LINE_TOKEN");
        HX.id_class(1795, "GL11.GL_POLYGON_TOKEN");
        HX.id_class(1796, "GL11.GL_BITMAP_TOKEN");
        HX.id_class(1797, "GL11.GL_DRAW_PIXEL_TOKEN");
        HX.id_class(1798, "GL11.GL_COPY_PIXEL_TOKEN");
        HX.id_class(1799, "GL11.GL_LINE_RESET_TOKEN");
        HX.id_class(2048, "GL11.GL_EXP");
        HX.id_class(2049, "GL11.GL_EXP2");
        HX.id_class(2304, "GL11.GL_CW");
        HX.id_class(2305, "GL11.GL_CCW");
        HX.id_class(2560, "GL11.GL_COEFF");
        HX.id_class(2561, "GL11.GL_ORDER");
        HX.id_class(2562, "GL11.GL_DOMAIN");
        HX.id_class(2816, "GL11.GL_CURRENT_COLOR");
        HX.id_class(2817, "GL11.GL_CURRENT_INDEX");
        HX.id_class(2818, "GL11.GL_CURRENT_NORMAL");
        HX.id_class(2819, "GL11.GL_CURRENT_TEXTURE_COORDS");
        HX.id_class(2820, "GL11.GL_CURRENT_RASTER_COLOR");
        HX.id_class(2821, "GL11.GL_CURRENT_RASTER_INDEX");
        HX.id_class(2822, "GL11.GL_CURRENT_RASTER_TEXTURE_COORDS");
        HX.id_class(2823, "GL11.GL_CURRENT_RASTER_POSITION");
        HX.id_class(2824, "GL11.GL_CURRENT_RASTER_POSITION_VALID");
        HX.id_class(2825, "GL11.GL_CURRENT_RASTER_DISTANCE");
        HX.id_class(2832, "GL11.GL_POINT_SMOOTH");
        HX.id_class(2833, "GL11.GL_POINT_SIZE");
        HX.id_class(2834, "GL11.GL_POINT_SIZE_RANGE");
        HX.id_class(2835, "GL11.GL_POINT_SIZE_GRANULARITY");
        HX.id_class(2848, "GL11.GL_LINE_SMOOTH");
        HX.id_class(2849, "GL11.GL_LINE_WIDTH");
        HX.id_class(2850, "GL11.GL_LINE_WIDTH_RANGE");
        HX.id_class(2851, "GL11.GL_LINE_WIDTH_GRANULARITY");
        HX.id_class(2852, "GL11.GL_LINE_STIPPLE");
        HX.id_class(2853, "GL11.GL_LINE_STIPPLE_PATTERN");
        HX.id_class(2854, "GL11.GL_LINE_STIPPLE_REPEAT");
        HX.id_class(2864, "GL11.GL_LIST_MODE");
        HX.id_class(2865, "GL11.GL_MAX_LIST_NESTING");
        HX.id_class(2866, "GL11.GL_LIST_BASE");
        HX.id_class(2867, "GL11.GL_LIST_INDEX");
        HX.id_class(2880, "GL11.GL_POLYGON_MODE");
        HX.id_class(2881, "GL11.GL_POLYGON_SMOOTH");
        HX.id_class(2882, "GL11.GL_POLYGON_STIPPLE");
        HX.id_class(2883, "GL11.GL_EDGE_FLAG");
        HX.id_class(2884, "GL11.GL_CULL_FACE");
        HX.id_class(2885, "GL11.GL_CULL_FACE_MODE");
        HX.id_class(2886, "GL11.GL_FRONT_FACE");
        HX.id_class(2896, "GL11.GL_LIGHTING");
        HX.id_class(2897, "GL11.GL_LIGHT_MODEL_LOCAL_VIEWER");
        HX.id_class(2898, "GL11.GL_LIGHT_MODEL_TWO_SIDE");
        HX.id_class(2899, "GL11.GL_LIGHT_MODEL_AMBIENT");
        HX.id_class(2900, "GL11.GL_SHADE_MODEL");
        HX.id_class(2901, "GL11.GL_COLOR_MATERIAL_FACE");
        HX.id_class(2902, "GL11.GL_COLOR_MATERIAL_PARAMETER");
        HX.id_class(2903, "GL11.GL_COLOR_MATERIAL");
        HX.id_class(2912, "GL11.GL_FOG");
        HX.id_class(2913, "GL11.GL_FOG_INDEX");
        HX.id_class(2914, "GL11.GL_FOG_DENSITY");
        HX.id_class(2915, "GL11.GL_FOG_START");
        HX.id_class(2916, "GL11.GL_FOG_END");
        HX.id_class(2917, "GL11.GL_FOG_MODE");
        HX.id_class(2918, "GL11.GL_FOG_COLOR");
        HX.id_class(2928, "GL11.GL_DEPTH_RANGE");
        HX.id_class(2929, "GL11.GL_DEPTH_TEST");
        HX.id_class(2930, "GL11.GL_DEPTH_WRITEMASK");
        HX.id_class(2931, "GL11.GL_DEPTH_CLEAR_VALUE");
        HX.id_class(2932, "GL11.GL_DEPTH_FUNC");
        HX.id_class(2944, "GL11.GL_ACCUM_CLEAR_VALUE");
        HX.id_class(2960, "GL11.GL_STENCIL_TEST");
        HX.id_class(2961, "GL11.GL_STENCIL_CLEAR_VALUE");
        HX.id_class(2962, "GL11.GL_STENCIL_FUNC");
        HX.id_class(2963, "GL11.GL_STENCIL_VALUE_MASK");
        HX.id_class(2964, "GL11.GL_STENCIL_FAIL");
        HX.id_class(2965, "GL11.GL_STENCIL_PASS_DEPTH_FAIL");
        HX.id_class(2966, "GL11.GL_STENCIL_PASS_DEPTH_PASS");
        HX.id_class(2967, "GL11.GL_STENCIL_REF");
        HX.id_class(2968, "GL11.GL_STENCIL_WRITEMASK");
        HX.id_class(2976, "GL11.GL_MATRIX_MODE");
        HX.id_class(2977, "GL11.GL_NORMALIZE");
        HX.id_class(2978, "GL11.GL_VIEWPORT");
        HX.id_class(2979, "GL11.GL_MODELVIEW_STACK_DEPTH");
        HX.id_class(2980, "GL11.GL_PROJECTION_STACK_DEPTH");
        HX.id_class(2981, "GL11.GL_TEXTURE_STACK_DEPTH");
        HX.id_class(2982, "GL11.GL_MODELVIEW_MATRIX");
        HX.id_class(2983, "GL11.GL_PROJECTION_MATRIX");
        HX.id_class(2984, "GL11.GL_TEXTURE_MATRIX");
        HX.id_class(2992, "GL11.GL_ATTRIB_STACK_DEPTH");
        HX.id_class(2993, "GL11.GL_CLIENT_ATTRIB_STACK_DEPTH");
        HX.id_class(3008, "GL11.GL_ALPHA_TEST");
        HX.id_class(3009, "GL11.GL_ALPHA_TEST_FUNC");
        HX.id_class(3010, "GL11.GL_ALPHA_TEST_REF");
        HX.id_class(3024, "GL11.GL_DITHER");
        HX.id_class(3040, "GL11.GL_BLEND_DST");
        HX.id_class(3041, "GL11.GL_BLEND_SRC");
        HX.id_class(3042, "GL11.GL_BLEND");
        HX.id_class(3056, "GL11.GL_LOGIC_OP_MODE");
        HX.id_class(3057, "GL11.GL_INDEX_LOGIC_OP");
        HX.id_class(3058, "GL11.GL_COLOR_LOGIC_OP");
        HX.id_class(3072, "GL11.GL_AUX_BUFFERS");
        HX.id_class(3073, "GL11.GL_DRAW_BUFFER");
        HX.id_class(3074, "GL11.GL_READ_BUFFER");
        HX.id_class(3088, "GL11.GL_SCISSOR_BOX");
        HX.id_class(3089, "GL11.GL_SCISSOR_TEST");
        HX.id_class(3104, "GL11.GL_INDEX_CLEAR_VALUE");
        HX.id_class(3105, "GL11.GL_INDEX_WRITEMASK");
        HX.id_class(3106, "GL11.GL_COLOR_CLEAR_VALUE");
        HX.id_class(3107, "GL11.GL_COLOR_WRITEMASK");
        HX.id_class(3120, "GL11.GL_INDEX_MODE");
        HX.id_class(3121, "GL11.GL_RGBA_MODE");
        HX.id_class(3122, "GL11.GL_DOUBLEBUFFER");
        HX.id_class(3123, "GL11.GL_STEREO");
        HX.id_class(3136, "GL11.GL_RENDER_MODE");
        HX.id_class(3152, "GL11.GL_PERSPECTIVE_CORRECTION_HINT");
        HX.id_class(3153, "GL11.GL_POINT_SMOOTH_HINT");
        HX.id_class(3154, "GL11.GL_LINE_SMOOTH_HINT");
        HX.id_class(3155, "GL11.GL_POLYGON_SMOOTH_HINT");
        HX.id_class(3156, "GL11.GL_FOG_HINT");
        HX.id_class(3168, "GL11.GL_TEXTURE_GEN_S");
        HX.id_class(3169, "GL11.GL_TEXTURE_GEN_T");
        HX.id_class(3170, "GL11.GL_TEXTURE_GEN_R");
        HX.id_class(3171, "GL11.GL_TEXTURE_GEN_Q");
        HX.id_class(3184, "GL11.GL_PIXEL_MAP_I_TO_I");
        HX.id_class(3185, "GL11.GL_PIXEL_MAP_S_TO_S");
        HX.id_class(3186, "GL11.GL_PIXEL_MAP_I_TO_R");
        HX.id_class(3187, "GL11.GL_PIXEL_MAP_I_TO_G");
        HX.id_class(3188, "GL11.GL_PIXEL_MAP_I_TO_B");
        HX.id_class(3189, "GL11.GL_PIXEL_MAP_I_TO_A");
        HX.id_class(3190, "GL11.GL_PIXEL_MAP_R_TO_R");
        HX.id_class(3191, "GL11.GL_PIXEL_MAP_G_TO_G");
        HX.id_class(3192, "GL11.GL_PIXEL_MAP_B_TO_B");
        HX.id_class(3193, "GL11.GL_PIXEL_MAP_A_TO_A");
        HX.id_class(3248, "GL11.GL_PIXEL_MAP_I_TO_I_SIZE");
        HX.id_class(3249, "GL11.GL_PIXEL_MAP_S_TO_S_SIZE");
        HX.id_class(3250, "GL11.GL_PIXEL_MAP_I_TO_R_SIZE");
        HX.id_class(3251, "GL11.GL_PIXEL_MAP_I_TO_G_SIZE");
        HX.id_class(3252, "GL11.GL_PIXEL_MAP_I_TO_B_SIZE");
        HX.id_class(3253, "GL11.GL_PIXEL_MAP_I_TO_A_SIZE");
        HX.id_class(3254, "GL11.GL_PIXEL_MAP_R_TO_R_SIZE");
        HX.id_class(3255, "GL11.GL_PIXEL_MAP_G_TO_G_SIZE");
        HX.id_class(3256, "GL11.GL_PIXEL_MAP_B_TO_B_SIZE");
        HX.id_class(3257, "GL11.GL_PIXEL_MAP_A_TO_A_SIZE");
        HX.id_class(3312, "GL11.GL_UNPACK_SWAP_BYTES");
        HX.id_class(3313, "GL11.GL_UNPACK_LSB_FIRST");
        HX.id_class(3314, "GL11.GL_UNPACK_ROW_LENGTH");
        HX.id_class(3315, "GL11.GL_UNPACK_SKIP_ROWS");
        HX.id_class(3316, "GL11.GL_UNPACK_SKIP_PIXELS");
        HX.id_class(3317, "GL11.GL_UNPACK_ALIGNMENT");
        HX.id_class(3328, "GL11.GL_PACK_SWAP_BYTES");
        HX.id_class(3329, "GL11.GL_PACK_LSB_FIRST");
        HX.id_class(3330, "GL11.GL_PACK_ROW_LENGTH");
        HX.id_class(3331, "GL11.GL_PACK_SKIP_ROWS");
        HX.id_class(3332, "GL11.GL_PACK_SKIP_PIXELS");
        HX.id_class(3333, "GL11.GL_PACK_ALIGNMENT");
        HX.id_class(3344, "GL11.GL_MAP_COLOR");
        HX.id_class(3345, "GL11.GL_MAP_STENCIL");
        HX.id_class(3346, "GL11.GL_INDEX_SHIFT");
        HX.id_class(3347, "GL11.GL_INDEX_OFFSET");
        HX.id_class(3348, "GL11.GL_RED_SCALE");
        HX.id_class(3349, "GL11.GL_RED_BIAS");
        HX.id_class(3350, "GL11.GL_ZOOM_X");
        HX.id_class(3351, "GL11.GL_ZOOM_Y");
        HX.id_class(3352, "GL11.GL_GREEN_SCALE");
        HX.id_class(3353, "GL11.GL_GREEN_BIAS");
        HX.id_class(3354, "GL11.GL_BLUE_SCALE");
        HX.id_class(3355, "GL11.GL_BLUE_BIAS");
        HX.id_class(3356, "GL11.GL_ALPHA_SCALE");
        HX.id_class(3357, "GL11.GL_ALPHA_BIAS");
        HX.id_class(3358, "GL11.GL_DEPTH_SCALE");
        HX.id_class(3359, "GL11.GL_DEPTH_BIAS");
        HX.id_class(3376, "GL11.GL_MAX_EVAL_ORDER");
        HX.id_class(3377, "GL11.GL_MAX_LIGHTS");
        HX.id_class(3378, "GL11.GL_MAX_CLIP_PLANES");
        HX.id_class(3379, "GL11.GL_MAX_TEXTURE_SIZE");
        HX.id_class(3380, "GL11.GL_MAX_PIXEL_MAP_TABLE");
        HX.id_class(3381, "GL11.GL_MAX_ATTRIB_STACK_DEPTH");
        HX.id_class(3382, "GL11.GL_MAX_MODELVIEW_STACK_DEPTH");
        HX.id_class(3383, "GL11.GL_MAX_NAME_STACK_DEPTH");
        HX.id_class(3384, "GL11.GL_MAX_PROJECTION_STACK_DEPTH");
        HX.id_class(3385, "GL11.GL_MAX_TEXTURE_STACK_DEPTH");
        HX.id_class(3386, "GL11.GL_MAX_VIEWPORT_DIMS");
        HX.id_class(3387, "GL11.GL_MAX_CLIENT_ATTRIB_STACK_DEPTH");
        HX.id_class(3408, "GL11.GL_SUBPIXEL_BITS");
        HX.id_class(3409, "GL11.GL_INDEX_BITS");
        HX.id_class(3410, "GL11.GL_RED_BITS");
        HX.id_class(3411, "GL11.GL_GREEN_BITS");
        HX.id_class(3412, "GL11.GL_BLUE_BITS");
        HX.id_class(3413, "GL11.GL_ALPHA_BITS");
        HX.id_class(3414, "GL11.GL_DEPTH_BITS");
        HX.id_class(3415, "GL11.GL_STENCIL_BITS");
        HX.id_class(3416, "GL11.GL_ACCUM_RED_BITS");
        HX.id_class(3417, "GL11.GL_ACCUM_GREEN_BITS");
        HX.id_class(3418, "GL11.GL_ACCUM_BLUE_BITS");
        HX.id_class(3419, "GL11.GL_ACCUM_ALPHA_BITS");
        HX.id_class(3440, "GL11.GL_NAME_STACK_DEPTH");
        HX.id_class(3456, "GL11.GL_AUTO_NORMAL");
        HX.id_class(3472, "GL11.GL_MAP1_COLOR_4");
        HX.id_class(3473, "GL11.GL_MAP1_INDEX");
        HX.id_class(3474, "GL11.GL_MAP1_NORMAL");
        HX.id_class(3475, "GL11.GL_MAP1_TEXTURE_COORD_1");
        HX.id_class(3476, "GL11.GL_MAP1_TEXTURE_COORD_2");
        HX.id_class(3477, "GL11.GL_MAP1_TEXTURE_COORD_3");
        HX.id_class(3478, "GL11.GL_MAP1_TEXTURE_COORD_4");
        HX.id_class(3479, "GL11.GL_MAP1_VERTEX_3");
        HX.id_class(3480, "GL11.GL_MAP1_VERTEX_4");
        HX.id_class(3504, "GL11.GL_MAP2_COLOR_4");
        HX.id_class(3505, "GL11.GL_MAP2_INDEX");
        HX.id_class(3506, "GL11.GL_MAP2_NORMAL");
        HX.id_class(3507, "GL11.GL_MAP2_TEXTURE_COORD_1");
        HX.id_class(3508, "GL11.GL_MAP2_TEXTURE_COORD_2");
        HX.id_class(3509, "GL11.GL_MAP2_TEXTURE_COORD_3");
        HX.id_class(3510, "GL11.GL_MAP2_TEXTURE_COORD_4");
        HX.id_class(3511, "GL11.GL_MAP2_VERTEX_3");
        HX.id_class(3512, "GL11.GL_MAP2_VERTEX_4");
        HX.id_class(3536, "GL11.GL_MAP1_GRID_DOMAIN");
        HX.id_class(3537, "GL11.GL_MAP1_GRID_SEGMENTS");
        HX.id_class(3538, "GL11.GL_MAP2_GRID_DOMAIN");
        HX.id_class(3539, "GL11.GL_MAP2_GRID_SEGMENTS");
        HX.id_class(3552, "GL11.GL_TEXTURE_1D");
        HX.id_class(3553, "GL11.GL_TEXTURE_2D");
        HX.id_class(3568, "GL11.GL_FEEDBACK_BUFFER_POINTER");
        HX.id_class(3569, "GL11.GL_FEEDBACK_BUFFER_SIZE");
        HX.id_class(3570, "GL11.GL_FEEDBACK_BUFFER_TYPE");
        HX.id_class(3571, "GL11.GL_SELECTION_BUFFER_POINTER");
        HX.id_class(3572, "GL11.GL_SELECTION_BUFFER_SIZE");
        HX.id_class(4096, "GL11.GL_TEXTURE_WIDTH");
        HX.id_class(4097, "GL11.GL_TEXTURE_HEIGHT");
        HX.id_class(4099, "GL11.GL_TEXTURE_INTERNAL_FORMAT");
        HX.id_class(4100, "GL11.GL_TEXTURE_BORDER_COLOR");
        HX.id_class(4101, "GL11.GL_TEXTURE_BORDER");
        HX.id_class(4352, "GL11.GL_DONT_CARE");
        HX.id_class(4353, "GL11.GL_FASTEST");
        HX.id_class(4354, "GL11.GL_NICEST");
        HX.id_class(16384, "GL11.GL_LIGHT0");
        HX.id_class(16385, "GL11.GL_LIGHT1");
        HX.id_class(16386, "GL11.GL_LIGHT2");
        HX.id_class(16387, "GL11.GL_LIGHT3");
        HX.id_class(16388, "GL11.GL_LIGHT4");
        HX.id_class(16389, "GL11.GL_LIGHT5");
        HX.id_class(16390, "GL11.GL_LIGHT6");
        HX.id_class(16391, "GL11.GL_LIGHT7");
        HX.id_class(4608, "GL11.GL_AMBIENT");
        HX.id_class(4609, "GL11.GL_DIFFUSE");
        HX.id_class(4610, "GL11.GL_SPECULAR");
        HX.id_class(4611, "GL11.GL_POSITION");
        HX.id_class(4612, "GL11.GL_SPOT_DIRECTION");
        HX.id_class(4613, "GL11.GL_SPOT_EXPONENT");
        HX.id_class(4614, "GL11.GL_SPOT_CUTOFF");
        HX.id_class(4615, "GL11.GL_CONSTANT_ATTENUATION");
        HX.id_class(4616, "GL11.GL_LINEAR_ATTENUATION");
        HX.id_class(4617, "GL11.GL_QUADRATIC_ATTENUATION");
        HX.id_class(4864, "GL11.GL_COMPILE");
        HX.id_class(4865, "GL11.GL_COMPILE_AND_EXECUTE");
        HX.id_class(5376, "GL11.GL_CLEAR");
        HX.id_class(5377, "GL11.GL_AND");
        HX.id_class(5378, "GL11.GL_AND_REVERSE");
        HX.id_class(5379, "GL11.GL_COPY");
        HX.id_class(5380, "GL11.GL_AND_INVERTED");
        HX.id_class(5381, "GL11.GL_NOOP");
        HX.id_class(5382, "GL11.GL_XOR");
        HX.id_class(5383, "GL11.GL_OR");
        HX.id_class(5384, "GL11.GL_NOR");
        HX.id_class(5385, "GL11.GL_EQUIV");
        HX.id_class(5386, "GL11.GL_INVERT");
        HX.id_class(5387, "GL11.GL_OR_REVERSE");
        HX.id_class(5388, "GL11.GL_COPY_INVERTED");
        HX.id_class(5389, "GL11.GL_OR_INVERTED");
        HX.id_class(5390, "GL11.GL_NAND");
        HX.id_class(5391, "GL11.GL_SET");
        HX.id_class(5632, "GL11.GL_EMISSION");
        HX.id_class(5633, "GL11.GL_SHININESS");
        HX.id_class(5634, "GL11.GL_AMBIENT_AND_DIFFUSE");
        HX.id_class(5635, "GL11.GL_COLOR_INDEXES");
        HX.id_class(5888, "GL11.GL_MODELVIEW");
        HX.id_class(5889, "GL11.GL_PROJECTION");
        HX.id_class(5890, "GL11.GL_TEXTURE");
        HX.id_class(6144, "GL11.GL_COLOR");
        HX.id_class(6145, "GL11.GL_DEPTH");
        HX.id_class(6146, "GL11.GL_STENCIL");
        HX.id_class(6400, "GL11.GL_COLOR_INDEX");
        HX.id_class(6401, "GL11.GL_STENCIL_INDEX");
        HX.id_class(6402, "GL11.GL_DEPTH_COMPONENT");
        HX.id_class(6403, "GL11.GL_RED");
        HX.id_class(6404, "GL11.GL_GREEN");
        HX.id_class(6405, "GL11.GL_BLUE");
        HX.id_class(6406, "GL11.GL_ALPHA");
        HX.id_class(6407, "GL11.GL_RGB");
        HX.id_class(6408, "GL11.GL_RGBA");
        HX.id_class(6409, "GL11.GL_LUMINANCE");
        HX.id_class(6410, "GL11.GL_LUMINANCE_ALPHA");
        HX.id_class(6656, "GL11.GL_BITMAP");
        HX.id_class(6912, "GL11.GL_POINT");
        HX.id_class(6913, "GL11.GL_LINE");
        HX.id_class(6914, "GL11.GL_FILL");
        HX.id_class(7168, "GL11.GL_RENDER");
        HX.id_class(7169, "GL11.GL_FEEDBACK");
        HX.id_class(7170, "GL11.GL_SELECT");
        HX.id_class(7424, "GL11.GL_FLAT");
        HX.id_class(7425, "GL11.GL_SMOOTH");
        HX.id_class(7680, "GL11.GL_KEEP");
        HX.id_class(7681, "GL11.GL_REPLACE");
        HX.id_class(7682, "GL11.GL_INCR");
        HX.id_class(7683, "GL11.GL_DECR");
        HX.id_class(7936, "GL11.GL_VENDOR");
        HX.id_class(7937, "GL11.GL_RENDERER");
        HX.id_class(7938, "GL11.GL_VERSION");
        HX.id_class(7939, "GL11.GL_EXTENSIONS");
        HX.id_class(8192, "GL11.GL_S");
        HX.id_class(8193, "GL11.GL_T");
        HX.id_class(8194, "GL11.GL_R");
        HX.id_class(8195, "GL11.GL_Q");
        HX.id_class(8448, "GL11.GL_MODULATE");
        HX.id_class(8449, "GL11.GL_DECAL");
        HX.id_class(8704, "GL11.GL_TEXTURE_ENV_MODE");
        HX.id_class(8705, "GL11.GL_TEXTURE_ENV_COLOR");
        HX.id_class(8960, "GL11.GL_TEXTURE_ENV");
        HX.id_class(9216, "GL11.GL_EYE_LINEAR");
        HX.id_class(9217, "GL11.GL_OBJECT_LINEAR");
        HX.id_class(9218, "GL11.GL_SPHERE_MAP");
        HX.id_class(9472, "GL11.GL_TEXTURE_GEN_MODE");
        HX.id_class(9473, "GL11.GL_OBJECT_PLANE");
        HX.id_class(9474, "GL11.GL_EYE_PLANE");
        HX.id_class(9728, "GL11.GL_NEAREST");
        HX.id_class(9729, "GL11.GL_LINEAR");
        HX.id_class(9984, "GL11.GL_NEAREST_MIPMAP_NEAREST");
        HX.id_class(9985, "GL11.GL_LINEAR_MIPMAP_NEAREST");
        HX.id_class(9986, "GL11.GL_NEAREST_MIPMAP_LINEAR");
        HX.id_class(9987, "GL11.GL_LINEAR_MIPMAP_LINEAR");
        HX.id_class(10240, "GL11.GL_TEXTURE_MAG_FILTER");
        HX.id_class(10241, "GL11.GL_TEXTURE_MIN_FILTER");
        HX.id_class(10242, "GL11.GL_TEXTURE_WRAP_S");
        HX.id_class(10243, "GL11.GL_TEXTURE_WRAP_T");
        HX.id_class(10496, "GL11.GL_CLAMP");
        HX.id_class(10497, "GL11.GL_REPEAT");
        HX.id_class(-1, "GL11.GL_ALL_CLIENT_ATTRIB_BITS");
        HX.id_class(32824, "GL11.GL_POLYGON_OFFSET_FACTOR");
        HX.id_class(10752, "GL11.GL_POLYGON_OFFSET_UNITS");
        HX.id_class(10753, "GL11.GL_POLYGON_OFFSET_POINT");
        HX.id_class(10754, "GL11.GL_POLYGON_OFFSET_LINE");
        HX.id_class(32823, "GL11.GL_POLYGON_OFFSET_FILL");
        HX.id_class(32827, "GL11.GL_ALPHA4");
        HX.id_class(32828, "GL11.GL_ALPHA8");
        HX.id_class(32829, "GL11.GL_ALPHA12");
        HX.id_class(32830, "GL11.GL_ALPHA16");
        HX.id_class(32831, "GL11.GL_LUMINANCE4");
        HX.id_class(32832, "GL11.GL_LUMINANCE8");
        HX.id_class(32833, "GL11.GL_LUMINANCE12");
        HX.id_class(32834, "GL11.GL_LUMINANCE16");
        HX.id_class(32835, "GL11.GL_LUMINANCE4_ALPHA4");
        HX.id_class(32836, "GL11.GL_LUMINANCE6_ALPHA2");
        HX.id_class(32837, "GL11.GL_LUMINANCE8_ALPHA8");
        HX.id_class(32838, "GL11.GL_LUMINANCE12_ALPHA4");
        HX.id_class(32839, "GL11.GL_LUMINANCE12_ALPHA12");
        HX.id_class(32840, "GL11.GL_LUMINANCE16_ALPHA16");
        HX.id_class(32841, "GL11.GL_INTENSITY");
        HX.id_class(32842, "GL11.GL_INTENSITY4");
        HX.id_class(32843, "GL11.GL_INTENSITY8");
        HX.id_class(32844, "GL11.GL_INTENSITY12");
        HX.id_class(32845, "GL11.GL_INTENSITY16");
        HX.id_class(10768, "GL11.GL_R3_G3_B2");
        HX.id_class(32847, "GL11.GL_RGB4");
        HX.id_class(32848, "GL11.GL_RGB5");
        HX.id_class(32849, "GL11.GL_RGB8");
        HX.id_class(32850, "GL11.GL_RGB10");
        HX.id_class(32851, "GL11.GL_RGB12");
        HX.id_class(32852, "GL11.GL_RGB16");
        HX.id_class(32853, "GL11.GL_RGBA2");
        HX.id_class(32854, "GL11.GL_RGBA4");
        HX.id_class(32855, "GL11.GL_RGB5_A1");
        HX.id_class(32856, "GL11.GL_RGBA8");
        HX.id_class(32857, "GL11.GL_RGB10_A2");
        HX.id_class(32858, "GL11.GL_RGBA12");
        HX.id_class(32859, "GL11.GL_RGBA16");
        HX.id_class(32860, "GL11.GL_TEXTURE_RED_SIZE");
        HX.id_class(32861, "GL11.GL_TEXTURE_GREEN_SIZE");
        HX.id_class(32862, "GL11.GL_TEXTURE_BLUE_SIZE");
        HX.id_class(32863, "GL11.GL_TEXTURE_ALPHA_SIZE");
        HX.id_class(32864, "GL11.GL_TEXTURE_LUMINANCE_SIZE");
        HX.id_class(32865, "GL11.GL_TEXTURE_INTENSITY_SIZE");
        HX.id_class(32867, "GL11.GL_PROXY_TEXTURE_1D");
        HX.id_class(32868, "GL11.GL_PROXY_TEXTURE_2D");
        HX.id_class(32870, "GL11.GL_TEXTURE_PRIORITY");
        HX.id_class(32871, "GL11.GL_TEXTURE_RESIDENT");
        HX.id_class(32872, "GL11.GL_TEXTURE_BINDING_1D");
        HX.id_class(32873, "GL11.GL_TEXTURE_BINDING_2D");
        HX.id_class(32884, "GL11.GL_VERTEX_ARRAY");
        HX.id_class(32885, "GL11.GL_NORMAL_ARRAY");
        HX.id_class(32886, "GL11.GL_COLOR_ARRAY");
        HX.id_class(32887, "GL11.GL_INDEX_ARRAY");
        HX.id_class(32888, "GL11.GL_TEXTURE_COORD_ARRAY");
        HX.id_class(32889, "GL11.GL_EDGE_FLAG_ARRAY");
        HX.id_class(32890, "GL11.GL_VERTEX_ARRAY_SIZE");
        HX.id_class(32891, "GL11.GL_VERTEX_ARRAY_TYPE");
        HX.id_class(32892, "GL11.GL_VERTEX_ARRAY_STRIDE");
        HX.id_class(32894, "GL11.GL_NORMAL_ARRAY_TYPE");
        HX.id_class(32895, "GL11.GL_NORMAL_ARRAY_STRIDE");
        HX.id_class(32897, "GL11.GL_COLOR_ARRAY_SIZE");
        HX.id_class(32898, "GL11.GL_COLOR_ARRAY_TYPE");
        HX.id_class(32899, "GL11.GL_COLOR_ARRAY_STRIDE");
        HX.id_class(32901, "GL11.GL_INDEX_ARRAY_TYPE");
        HX.id_class(32902, "GL11.GL_INDEX_ARRAY_STRIDE");
        HX.id_class(32904, "GL11.GL_TEXTURE_COORD_ARRAY_SIZE");
        HX.id_class(32905, "GL11.GL_TEXTURE_COORD_ARRAY_TYPE");
        HX.id_class(32906, "GL11.GL_TEXTURE_COORD_ARRAY_STRIDE");
        HX.id_class(32908, "GL11.GL_EDGE_FLAG_ARRAY_STRIDE");
        HX.id_class(32910, "GL11.GL_VERTEX_ARRAY_POINTER");
        HX.id_class(32911, "GL11.GL_NORMAL_ARRAY_POINTER");
        HX.id_class(32912, "GL11.GL_COLOR_ARRAY_POINTER");
        HX.id_class(32913, "GL11.GL_INDEX_ARRAY_POINTER");
        HX.id_class(32914, "GL11.GL_TEXTURE_COORD_ARRAY_POINTER");
        HX.id_class(32915, "GL11.GL_EDGE_FLAG_ARRAY_POINTER");
        HX.id_class(10784, "GL11.GL_V2F");
        HX.id_class(10785, "GL11.GL_V3F");
        HX.id_class(10786, "GL11.GL_C4UB_V2F");
        HX.id_class(10787, "GL11.GL_C4UB_V3F");
        HX.id_class(10788, "GL11.GL_C3F_V3F");
        HX.id_class(10789, "GL11.GL_N3F_V3F");
        HX.id_class(10790, "GL11.GL_C4F_N3F_V3F");
        HX.id_class(10791, "GL11.GL_T2F_V3F");
        HX.id_class(10792, "GL11.GL_T4F_V4F");
        HX.id_class(10793, "GL11.GL_T2F_C4UB_V3F");
        HX.id_class(10794, "GL11.GL_T2F_C3F_V3F");
        HX.id_class(10795, "GL11.GL_T2F_N3F_V3F");
        HX.id_class(10796, "GL11.GL_T2F_C4F_N3F_V3F");
        HX.id_class(10797, "GL11.GL_T4F_C4F_N3F_V4F");
        HX.id_class(3057, "GL11.GL_LOGIC_OP");
        HX.id_class(4099, "GL11.GL_TEXTURE_COMPONENTS");
        HX.id_class(32874, "GL12.GL_TEXTURE_BINDING_3D");
        HX.id_class(32875, "GL12.GL_PACK_SKIP_IMAGES");
        HX.id_class(32876, "GL12.GL_PACK_IMAGE_HEIGHT");
        HX.id_class(32877, "GL12.GL_UNPACK_SKIP_IMAGES");
        HX.id_class(32878, "GL12.GL_UNPACK_IMAGE_HEIGHT");
        HX.id_class(32879, "GL12.GL_TEXTURE_3D");
        HX.id_class(32880, "GL12.GL_PROXY_TEXTURE_3D");
        HX.id_class(32881, "GL12.GL_TEXTURE_DEPTH");
        HX.id_class(32882, "GL12.GL_TEXTURE_WRAP_R");
        HX.id_class(32883, "GL12.GL_MAX_3D_TEXTURE_SIZE");
        HX.id_class(32992, "GL12.GL_BGR");
        HX.id_class(32993, "GL12.GL_BGRA");
        HX.id_class(32818, "GL12.GL_UNSIGNED_BYTE_3_3_2");
        HX.id_class(33634, "GL12.GL_UNSIGNED_BYTE_2_3_3_REV");
        HX.id_class(33635, "GL12.GL_UNSIGNED_SHORT_5_6_5");
        HX.id_class(33636, "GL12.GL_UNSIGNED_SHORT_5_6_5_REV");
        HX.id_class(32819, "GL12.GL_UNSIGNED_SHORT_4_4_4_4");
        HX.id_class(33637, "GL12.GL_UNSIGNED_SHORT_4_4_4_4_REV");
        HX.id_class(32820, "GL12.GL_UNSIGNED_SHORT_5_5_5_1");
        HX.id_class(33638, "GL12.GL_UNSIGNED_SHORT_1_5_5_5_REV");
        HX.id_class(32821, "GL12.GL_UNSIGNED_INT_8_8_8_8");
        HX.id_class(33639, "GL12.GL_UNSIGNED_INT_8_8_8_8_REV");
        HX.id_class(32822, "GL12.GL_UNSIGNED_INT_10_10_10_2");
        HX.id_class(33640, "GL12.GL_UNSIGNED_INT_2_10_10_10_REV");
        HX.id_class(32826, "GL12.GL_RESCALE_NORMAL");
        HX.id_class(33272, "GL12.GL_LIGHT_MODEL_COLOR_CONTROL");
        HX.id_class(33273, "GL12.GL_SINGLE_COLOR");
        HX.id_class(33274, "GL12.GL_SEPARATE_SPECULAR_COLOR");
        HX.id_class(33071, "GL12.GL_CLAMP_TO_EDGE");
        HX.id_class(33082, "GL12.GL_TEXTURE_MIN_LOD");
        HX.id_class(33083, "GL12.GL_TEXTURE_MAX_LOD");
        HX.id_class(33084, "GL12.GL_TEXTURE_BASE_LEVEL");
        HX.id_class(33085, "GL12.GL_TEXTURE_MAX_LEVEL");
        HX.id_class(33000, "GL12.GL_MAX_ELEMENTS_VERTICES");
        HX.id_class(33001, "GL12.GL_MAX_ELEMENTS_INDICES");
        HX.id_class(33901, "GL12.GL_ALIASED_POINT_SIZE_RANGE");
        HX.id_class(33902, "GL12.GL_ALIASED_LINE_WIDTH_RANGE");
        HX.id_class(33984, "GL13.GL_TEXTURE0");
        HX.id_class(33985, "GL13.GL_TEXTURE1");
        HX.id_class(33986, "GL13.GL_TEXTURE2");
        HX.id_class(33987, "GL13.GL_TEXTURE3");
        HX.id_class(33988, "GL13.GL_TEXTURE4");
        HX.id_class(33989, "GL13.GL_TEXTURE5");
        HX.id_class(33990, "GL13.GL_TEXTURE6");
        HX.id_class(33991, "GL13.GL_TEXTURE7");
        HX.id_class(33992, "GL13.GL_TEXTURE8");
        HX.id_class(33993, "GL13.GL_TEXTURE9");
        HX.id_class(33994, "GL13.GL_TEXTURE10");
        HX.id_class(33995, "GL13.GL_TEXTURE11");
        HX.id_class(33996, "GL13.GL_TEXTURE12");
        HX.id_class(33997, "GL13.GL_TEXTURE13");
        HX.id_class(33998, "GL13.GL_TEXTURE14");
        HX.id_class(33999, "GL13.GL_TEXTURE15");
        HX.id_class(34000, "GL13.GL_TEXTURE16");
        HX.id_class(34001, "GL13.GL_TEXTURE17");
        HX.id_class(34002, "GL13.GL_TEXTURE18");
        HX.id_class(34003, "GL13.GL_TEXTURE19");
        HX.id_class(34004, "GL13.GL_TEXTURE20");
        HX.id_class(34005, "GL13.GL_TEXTURE21");
        HX.id_class(34006, "GL13.GL_TEXTURE22");
        HX.id_class(34007, "GL13.GL_TEXTURE23");
        HX.id_class(34008, "GL13.GL_TEXTURE24");
        HX.id_class(34009, "GL13.GL_TEXTURE25");
        HX.id_class(34010, "GL13.GL_TEXTURE26");
        HX.id_class(34011, "GL13.GL_TEXTURE27");
        HX.id_class(34012, "GL13.GL_TEXTURE28");
        HX.id_class(34013, "GL13.GL_TEXTURE29");
        HX.id_class(34014, "GL13.GL_TEXTURE30");
        HX.id_class(34015, "GL13.GL_TEXTURE31");
        HX.id_class(34016, "GL13.GL_ACTIVE_TEXTURE");
        HX.id_class(34017, "GL13.GL_CLIENT_ACTIVE_TEXTURE");
        HX.id_class(34018, "GL13.GL_MAX_TEXTURE_UNITS");
        HX.id_class(34065, "GL13.GL_NORMAL_MAP");
        HX.id_class(34066, "GL13.GL_REFLECTION_MAP");
        HX.id_class(34067, "GL13.GL_TEXTURE_CUBE_MAP");
        HX.id_class(34068, "GL13.GL_TEXTURE_BINDING_CUBE_MAP");
        HX.id_class(34069, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_X");
        HX.id_class(34070, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_X");
        HX.id_class(34071, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Y");
        HX.id_class(34072, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y");
        HX.id_class(34073, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Z");
        HX.id_class(34074, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z");
        HX.id_class(34075, "GL13.GL_PROXY_TEXTURE_CUBE_MAP");
        HX.id_class(34076, "GL13.GL_MAX_CUBE_MAP_TEXTURE_SIZE");
        HX.id_class(34025, "GL13.GL_COMPRESSED_ALPHA");
        HX.id_class(34026, "GL13.GL_COMPRESSED_LUMINANCE");
        HX.id_class(34027, "GL13.GL_COMPRESSED_LUMINANCE_ALPHA");
        HX.id_class(34028, "GL13.GL_COMPRESSED_INTENSITY");
        HX.id_class(34029, "GL13.GL_COMPRESSED_RGB");
        HX.id_class(34030, "GL13.GL_COMPRESSED_RGBA");
        HX.id_class(34031, "GL13.GL_TEXTURE_COMPRESSION_HINT");
        HX.id_class(34464, "GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE");
        HX.id_class(34465, "GL13.GL_TEXTURE_COMPRESSED");
        HX.id_class(34466, "GL13.GL_NUM_COMPRESSED_TEXTURE_FORMATS");
        HX.id_class(34467, "GL13.GL_COMPRESSED_TEXTURE_FORMATS");
        HX.id_class(32925, "GL13.GL_MULTISAMPLE");
        HX.id_class(32926, "GL13.GL_SAMPLE_ALPHA_TO_COVERAGE");
        HX.id_class(32927, "GL13.GL_SAMPLE_ALPHA_TO_ONE");
        HX.id_class(32928, "GL13.GL_SAMPLE_COVERAGE");
        HX.id_class(32936, "GL13.GL_SAMPLE_BUFFERS");
        HX.id_class(32937, "GL13.GL_SAMPLES");
        HX.id_class(32938, "GL13.GL_SAMPLE_COVERAGE_VALUE");
        HX.id_class(32939, "GL13.GL_SAMPLE_COVERAGE_INVERT");
        HX.id_class(34019, "GL13.GL_TRANSPOSE_MODELVIEW_MATRIX");
        HX.id_class(34020, "GL13.GL_TRANSPOSE_PROJECTION_MATRIX");
        HX.id_class(34021, "GL13.GL_TRANSPOSE_TEXTURE_MATRIX");
        HX.id_class(34022, "GL13.GL_TRANSPOSE_COLOR_MATRIX");
        HX.id_class(34160, "GL13.GL_COMBINE");
        HX.id_class(34161, "GL13.GL_COMBINE_RGB");
        HX.id_class(34162, "GL13.GL_COMBINE_ALPHA");
        HX.id_class(34176, "GL13.GL_SOURCE0_RGB");
        HX.id_class(34177, "GL13.GL_SOURCE1_RGB");
        HX.id_class(34178, "GL13.GL_SOURCE2_RGB");
        HX.id_class(34184, "GL13.GL_SOURCE0_ALPHA");
        HX.id_class(34185, "GL13.GL_SOURCE1_ALPHA");
        HX.id_class(34186, "GL13.GL_SOURCE2_ALPHA");
        HX.id_class(34192, "GL13.GL_OPERAND0_RGB");
        HX.id_class(34193, "GL13.GL_OPERAND1_RGB");
        HX.id_class(34194, "GL13.GL_OPERAND2_RGB");
        HX.id_class(34200, "GL13.GL_OPERAND0_ALPHA");
        HX.id_class(34201, "GL13.GL_OPERAND1_ALPHA");
        HX.id_class(34202, "GL13.GL_OPERAND2_ALPHA");
        HX.id_class(34163, "GL13.GL_RGB_SCALE");
        HX.id_class(34164, "GL13.GL_ADD_SIGNED");
        HX.id_class(34165, "GL13.GL_INTERPOLATE");
        HX.id_class(34023, "GL13.GL_SUBTRACT");
        HX.id_class(34166, "GL13.GL_CONSTANT");
        HX.id_class(34167, "GL13.GL_PRIMARY_COLOR");
        HX.id_class(34168, "GL13.GL_PREVIOUS");
        HX.id_class(34478, "GL13.GL_DOT3_RGB");
        HX.id_class(34479, "GL13.GL_DOT3_RGBA");
        HX.id_class(33069, "GL13.GL_CLAMP_TO_BORDER");
        HX.id_class(33169, "GL14.GL_GENERATE_MIPMAP");
        HX.id_class(33170, "GL14.GL_GENERATE_MIPMAP_HINT");
        HX.id_class(33189, "GL14.GL_DEPTH_COMPONENT16");
        HX.id_class(33190, "GL14.GL_DEPTH_COMPONENT24");
        HX.id_class(33191, "GL14.GL_DEPTH_COMPONENT32");
        HX.id_class(34890, "GL14.GL_TEXTURE_DEPTH_SIZE");
        HX.id_class(34891, "GL14.GL_DEPTH_TEXTURE_MODE");
        HX.id_class(34892, "GL14.GL_TEXTURE_COMPARE_MODE");
        HX.id_class(34893, "GL14.GL_TEXTURE_COMPARE_FUNC");
        HX.id_class(34894, "GL14.GL_COMPARE_R_TO_TEXTURE");
        HX.id_class(33872, "GL14.GL_FOG_COORDINATE_SOURCE");
        HX.id_class(33873, "GL14.GL_FOG_COORDINATE");
        HX.id_class(33874, "GL14.GL_FRAGMENT_DEPTH");
        HX.id_class(33875, "GL14.GL_CURRENT_FOG_COORDINATE");
        HX.id_class(33876, "GL14.GL_FOG_COORDINATE_ARRAY_TYPE");
        HX.id_class(33877, "GL14.GL_FOG_COORDINATE_ARRAY_STRIDE");
        HX.id_class(33878, "GL14.GL_FOG_COORDINATE_ARRAY_POINTER");
        HX.id_class(33879, "GL14.GL_FOG_COORDINATE_ARRAY");
        HX.id_class(33062, "GL14.GL_POINT_SIZE_MIN");
        HX.id_class(33063, "GL14.GL_POINT_SIZE_MAX");
        HX.id_class(33064, "GL14.GL_POINT_FADE_THRESHOLD_SIZE");
        HX.id_class(33065, "GL14.GL_POINT_DISTANCE_ATTENUATION");
        HX.id_class(33880, "GL14.GL_COLOR_SUM");
        HX.id_class(33881, "GL14.GL_CURRENT_SECONDARY_COLOR");
        HX.id_class(33882, "GL14.GL_SECONDARY_COLOR_ARRAY_SIZE");
        HX.id_class(33883, "GL14.GL_SECONDARY_COLOR_ARRAY_TYPE");
        HX.id_class(33884, "GL14.GL_SECONDARY_COLOR_ARRAY_STRIDE");
        HX.id_class(33885, "GL14.GL_SECONDARY_COLOR_ARRAY_POINTER");
        HX.id_class(33886, "GL14.GL_SECONDARY_COLOR_ARRAY");
        HX.id_class(32968, "GL14.GL_BLEND_DST_RGB");
        HX.id_class(32969, "GL14.GL_BLEND_SRC_RGB");
        HX.id_class(32970, "GL14.GL_BLEND_DST_ALPHA");
        HX.id_class(32971, "GL14.GL_BLEND_SRC_ALPHA");
        HX.id_class(34055, "GL14.GL_INCR_WRAP");
        HX.id_class(34056, "GL14.GL_DECR_WRAP");
        HX.id_class(34048, "GL14.GL_TEXTURE_FILTER_CONTROL");
        HX.id_class(34049, "GL14.GL_TEXTURE_LOD_BIAS");
        HX.id_class(34045, "GL14.GL_MAX_TEXTURE_LOD_BIAS");
        HX.id_class(33648, "GL14.GL_MIRRORED_REPEAT");
        HX.id_class(32773, "ARBImaging.GL_BLEND_COLOR");
        HX.id_class(32777, "ARBImaging.GL_BLEND_EQUATION");
        HX.id_class(32774, "GL14.GL_FUNC_ADD");
        HX.id_class(32778, "GL14.GL_FUNC_SUBTRACT");
        HX.id_class(32779, "GL14.GL_FUNC_REVERSE_SUBTRACT");
        HX.id_class(32775, "GL14.GL_MIN");
        HX.id_class(32776, "GL14.GL_MAX");
        HX.id_class(34962, "GL15.GL_ARRAY_BUFFER");
        HX.id_class(34963, "GL15.GL_ELEMENT_ARRAY_BUFFER");
        HX.id_class(34964, "GL15.GL_ARRAY_BUFFER_BINDING");
        HX.id_class(34965, "GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING");
        HX.id_class(34966, "GL15.GL_VERTEX_ARRAY_BUFFER_BINDING");
        HX.id_class(34967, "GL15.GL_NORMAL_ARRAY_BUFFER_BINDING");
        HX.id_class(34968, "GL15.GL_COLOR_ARRAY_BUFFER_BINDING");
        HX.id_class(34969, "GL15.GL_INDEX_ARRAY_BUFFER_BINDING");
        HX.id_class(34970, "GL15.GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING");
        HX.id_class(34971, "GL15.GL_EDGE_FLAG_ARRAY_BUFFER_BINDING");
        HX.id_class(34972, "GL15.GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING");
        HX.id_class(34973, "GL15.GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING");
        HX.id_class(34974, "GL15.GL_WEIGHT_ARRAY_BUFFER_BINDING");
        HX.id_class(34975, "GL15.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING");
        HX.id_class(35040, "GL15.GL_STREAM_DRAW");
        HX.id_class(35041, "GL15.GL_STREAM_READ");
        HX.id_class(35042, "GL15.GL_STREAM_COPY");
        HX.id_class(35044, "GL15.GL_STATIC_DRAW");
        HX.id_class(35045, "GL15.GL_STATIC_READ");
        HX.id_class(35046, "GL15.GL_STATIC_COPY");
        HX.id_class(35048, "GL15.GL_DYNAMIC_DRAW");
        HX.id_class(35049, "GL15.GL_DYNAMIC_READ");
        HX.id_class(35050, "GL15.GL_DYNAMIC_COPY");
        HX.id_class(35000, "GL15.GL_READ_ONLY");
        HX.id_class(35001, "GL15.GL_WRITE_ONLY");
        HX.id_class(35002, "GL15.GL_READ_WRITE");
        HX.id_class(34660, "GL15.GL_BUFFER_SIZE");
        HX.id_class(34661, "GL15.GL_BUFFER_USAGE");
        HX.id_class(35003, "GL15.GL_BUFFER_ACCESS");
        HX.id_class(35004, "GL15.GL_BUFFER_MAPPED");
        HX.id_class(35005, "GL15.GL_BUFFER_MAP_POINTER");
        HX.id_class(34138, "NVFogDistance.GL_FOG_DISTANCE_MODE_NV");
        HX.id_class(34139, "NVFogDistance.GL_EYE_RADIAL_NV");
        HX.id_class(34140, "NVFogDistance.GL_EYE_PLANE_ABSOLUTE_NV");
    }

    public static void id_class(int n, boolean bl) {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        if (n > 0) {
            GLCapabilities gLCapabilities = GL.getCapabilities();
            if (gLCapabilities.GL_KHR_debug) {
                GL11.glEnable((int)37600);
                if (bl) {
                    GL11.glEnable((int)33346);
                }
                for (int i = 0; i < id_private.size(); ++i) {
                    boolean bl2 = i < n;
                    KHRDebug.glDebugMessageControl((int)4352, (int)4352, (int)id_private.get(i), (int[])null, (boolean)bl2);
                }
                KHRDebug.glDebugMessageCallback((GLDebugMessageCallbackI)((GLDebugMessageCallbackI)GLX.make(GLDebugMessageCallback.create(HX::id_class), gs_3::id_class)), (long)0L);
            } else if (gLCapabilities.GL_ARB_debug_output) {
                if (bl) {
                    GL11.glEnable((int)33346);
                }
                for (int i = 0; i < id_implements.size(); ++i) {
                    boolean bl3 = i < n;
                    ARBDebugOutput.glDebugMessageControlARB((int)4352, (int)4352, (int)id_implements.get(i), (int[])null, (boolean)bl3);
                }
                ARBDebugOutput.glDebugMessageCallbackARB((GLDebugMessageARBCallbackI)((GLDebugMessageARBCallbackI)GLX.make(GLDebugMessageARBCallback.create(HX::id_class), gs_3::id_class)), (long)0L);
            }
        }
    }

    private static void id_class(int n, int n2, int n3, int n4, int n5, long l, long l2) {
        QY qY;
        if (!(n2 == 33385 || n2 == 33386 || rrki_1.id_class(id_extends, n3) || rrbb_3.rs() && n == 33352 || (qY = QY.id_instanceof()) != null && qY.id_else() != null && qY.id_else().id_goto() || !rrbo_3.id_class(n3))) {
            String string = HX.id_break(n);
            String string2 = HX.id_byte(n2);
            String string3 = HX.id_protected(n4);
            String string4 = GLDebugMessageCallback.getMessage((int)n5, (long)l);
            string4 = rrzX_2.id_private(string4, " \n\r\t");
            String string5 = String.format("OpenGL %s %s: %s (%s)", string, string2, n3, string4);
            Exception exception = new Exception("Stack trace");
            StackTraceElement[] stackTraceElementArray = exception.getStackTrace();
            StackTraceElement[] stackTraceElementArray2 = stackTraceElementArray.length > 2 ? Arrays.copyOfRange(stackTraceElementArray, 2, stackTraceElementArray.length) : stackTraceElementArray;
            exception.setStackTrace(stackTraceElementArray2);
            if (n2 == 33356) {
                id_protected.error(string5, (Throwable)exception);
            } else {
                id_protected.info(string5, (Throwable)exception);
            }
            if (rrbb_3.rT() && rrzQ_2.id_class("ShowGlErrorDebug", 10000L)) {
                String string6 = rrbb_3.id_byte(n3);
                if (n3 == 0 || rrbb_3.id_class((Object)string6, (Object)"Unknown")) {
                    string6 = string4;
                }
                String string7 = jI_2.id_class("of.message.openglError", n3, string6);
                ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class(new rgN_2(string7));
            }
        }
    }

    private static int[] id_class() {
        String string = System.getProperty("gl.ignore.errors");
        if (string == null) {
            return new int[0];
        }
        String[] stringArray = rrbb_3.id_class(string, ",");
        int[] nArray = new int[]{};
        for (int i = 0; i < stringArray.length; ++i) {
            int n;
            String string2 = stringArray[i].trim();
            int n2 = n = string2.startsWith("0x") ? rrbb_3.id_break(string2, -1) : rrbb_3.id_class(string2, -1);
            if (n < 0) {
                rrbb_3.id_protected("Invalid error id: " + string2);
                continue;
            }
            rrbb_3.id_case("Ignore OpenGL error: " + n);
            nArray = rrki_1.id_break(nArray, n);
        }
        return nArray;
    }

    private static String id_class(int n) {
        return "Unknown (0x" + Integer.toHexString(n).toUpperCase() + ")";
    }

    private static void id_class(int n, String string3) {
        id_catch.merge(n, string3, (string, string2) -> string + "/" + string2);
    }

    private static String id_break(int n) {
        switch (n) {
            case 33350: {
                return "API";
            }
            case 33351: {
                return "WINDOW SYSTEM";
            }
            case 33352: {
                return "SHADER COMPILER";
            }
            case 33353: {
                return "THIRD PARTY";
            }
            case 33354: {
                return "APPLICATION";
            }
            case 33355: {
                return "OTHER";
            }
        }
        return HX.id_class(n);
    }

    private static String id_protected(int n) {
        switch (n) {
            case 33387: {
                return "NOTIFICATION";
            }
            case 37190: {
                return "HIGH";
            }
            case 37191: {
                return "MEDIUM";
            }
            case 37192: {
                return "LOW";
            }
        }
        return HX.id_class(n);
    }
}

