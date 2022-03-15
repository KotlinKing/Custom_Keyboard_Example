package com.example.custom_keyboard_example

import android.content.Context
import android.text.TextUtils
import android.util.AttributeSet
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.InputConnection
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import kotlinx.android.synthetic.main.keyboard.view.*

class MyKeyboard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) :
    LinearLayoutCompat(context, attrs, defStyleAttr), View.OnClickListener,
    View.OnLongClickListener {
    private var inputConnection: InputConnection? = null
    private var caps: Boolean = false
    private val keyValues = SparseArray<String>()

    private fun init(context: Context, attrs: AttributeSet?) {
        LayoutInflater.from(context).inflate(R.layout.keyboard, this, true)

        /*Row 1*/
        button_back_quote.setOnClickListener(this)
        button_1.setOnClickListener(this)
        button_2.setOnClickListener(this)
        button_3.setOnClickListener(this)
        button_4.setOnClickListener(this)
        button_5.setOnClickListener(this)
        button_6.setOnClickListener(this)
        button_7.setOnClickListener(this)
        button_8.setOnClickListener(this)
        button_9.setOnClickListener(this)
        button_0.setOnClickListener(this)
        button_minus.setOnClickListener(this)
        button_plus.setOnClickListener(this)
        button_delete.setOnClickListener(this)

        /*Row 1 Long Press Listener*/
        button_back_quote.setOnLongClickListener(this)
        button_1.setOnLongClickListener(this)
        button_2.setOnLongClickListener(this)
        button_3.setOnLongClickListener(this)
        button_4.setOnLongClickListener(this)
        button_5.setOnLongClickListener(this)
        button_6.setOnLongClickListener(this)
        button_7.setOnLongClickListener(this)
        button_8.setOnLongClickListener(this)
        button_9.setOnLongClickListener(this)
        button_0.setOnLongClickListener(this)
        button_minus.setOnLongClickListener(this)
        button_plus.setOnLongClickListener(this)

        /*Row 2*/
        button_tab.setOnClickListener(this)
        button_q.setOnClickListener(this)
        button_w.setOnClickListener(this)
        button_e.setOnClickListener(this)
        button_r.setOnClickListener(this)
        button_t.setOnClickListener(this)
        button_y.setOnClickListener(this)
        button_u.setOnClickListener(this)
        button_i.setOnClickListener(this)
        button_o.setOnClickListener(this)
        button_p.setOnClickListener(this)
        button_open_brace.setOnClickListener(this)
        button_close_brace.setOnClickListener(this)
        button_backslash.setOnClickListener(this)

        /*Row 3*/
        button_caps.setOnClickListener(this)
        button_a.setOnClickListener(this)
        button_s.setOnClickListener(this)
        button_d.setOnClickListener(this)
        button_f.setOnClickListener(this)
        button_g.setOnClickListener(this)
        button_h.setOnClickListener(this)
        button_j.setOnClickListener(this)
        button_k.setOnClickListener(this)
        button_l.setOnClickListener(this)
        button_colon.setOnClickListener(this)
        button_quote.setOnClickListener(this)
        button_enter.setOnClickListener(this)

        /*Row 4*/
        button_left_shift.setOnClickListener(this)
        button_z.setOnClickListener(this)
        button_x.setOnClickListener(this)
        button_c.setOnClickListener(this)
        button_v.setOnClickListener(this)
        button_b.setOnClickListener(this)
        button_n.setOnClickListener(this)
        button_m.setOnClickListener(this)
        button_open_angle.setOnClickListener(this)
        button_close_angle.setOnClickListener(this)
        button_question.setOnClickListener(this)
        button_right_shift.setOnClickListener(this)

        /*Row 5*/
        button_fun.setOnClickListener(this)
        button_left_ctrl.setOnClickListener(this)
        button_left_Alt.setOnClickListener(this)
        button_space.setOnClickListener(this)
        button_right_ctrl.setOnClickListener(this)
        button_right_alt.setOnClickListener(this)
        button_left_arrow.setOnClickListener(this)
        button_top_arrow.setOnClickListener(this)
        button_down_arrow.setOnClickListener(this)
        button_right_arrow.setOnClickListener(this)

        setvalues()
    }

    private fun setvalues() {
        if (caps) {
            /*Upper Case letters*/

            /*Row 1*/
            tv_q.text = "Q"
            tv_w.text = "W"
            tv_e.text = "E"
            tv_r.text = "R"
            tv_t.text = "T"
            tv_y.text = "Y"
            tv_u.text = "U"
            tv_i.text = "I"
            tv_o.text = "O"
            tv_p.text = "P"

            keyValues.put(R.id.button_q, "Q")
            keyValues.put(R.id.button_w, "W")
            keyValues.put(R.id.button_e, "E")
            keyValues.put(R.id.button_r, "R")
            keyValues.put(R.id.button_t, "T")
            keyValues.put(R.id.button_y, "Y")
            keyValues.put(R.id.button_u, "U")
            keyValues.put(R.id.button_i, "I")
            keyValues.put(R.id.button_o, "O")
            keyValues.put(R.id.button_p, "P")

            /*Row 2*/
            tv_a.text = "A"
            tv_s.text = "S"
            tv_d.text = "D"
            tv_f.text = "F"
            tv_g.text = "G"
            tv_h.text = "H"
            tv_j.text = "J"
            tv_k.text = "K"
            tv_l.text = "L"

            keyValues.put(R.id.button_a, "A")
            keyValues.put(R.id.button_s, "S")
            keyValues.put(R.id.button_d, "D")
            keyValues.put(R.id.button_f, "F")
            keyValues.put(R.id.button_g, "G")
            keyValues.put(R.id.button_h, "H")
            keyValues.put(R.id.button_j, "J")
            keyValues.put(R.id.button_k, "K")
            keyValues.put(R.id.button_l, "L")

            /*Row 3*/
            tv_z.text = "Z"
            tv_x.text = "X"
            tv_c.text = "C"
            tv_v.text = "V"
            tv_b.text = "B"
            tv_n.text = "N"
            tv_m.text = "M"

            keyValues.put(R.id.button_z, "Z")
            keyValues.put(R.id.button_x, "X")
            keyValues.put(R.id.button_c, "C")
            keyValues.put(R.id.button_v, "V")
            keyValues.put(R.id.button_b, "B")
            keyValues.put(R.id.button_n, "N")
            keyValues.put(R.id.button_m, "M")

        } else {
            /*Small Case letters*/

            /*Row 1*/
            tv_q.text = "q"
            tv_w.text = "w"
            tv_e.text = "e"
            tv_r.text = "r"
            tv_t.text = "t"
            tv_y.text = "y"
            tv_u.text = "u"
            tv_i.text = "i"
            tv_o.text = "o"
            tv_p.text = "p"

            keyValues.put(R.id.button_q, "q")
            keyValues.put(R.id.button_w, "w")
            keyValues.put(R.id.button_e, "e")
            keyValues.put(R.id.button_r, "r")
            keyValues.put(R.id.button_t, "t")
            keyValues.put(R.id.button_y, "y")
            keyValues.put(R.id.button_u, "u")
            keyValues.put(R.id.button_i, "i")
            keyValues.put(R.id.button_o, "o")
            keyValues.put(R.id.button_p, "p")

            /*Row 2*/
            tv_a.text = "a"
            tv_s.text = "s"
            tv_d.text = "d"
            tv_f.text = "f"
            tv_g.text = "g"
            tv_h.text = "h"
            tv_j.text = "j"
            tv_k.text = "k"
            tv_l.text = "l"

            keyValues.put(R.id.button_a, "a")
            keyValues.put(R.id.button_s, "s")
            keyValues.put(R.id.button_d, "d")
            keyValues.put(R.id.button_f, "f")
            keyValues.put(R.id.button_g, "g")
            keyValues.put(R.id.button_h, "h")
            keyValues.put(R.id.button_j, "j")
            keyValues.put(R.id.button_k, "k")
            keyValues.put(R.id.button_l, "l")

            /*Row 3*/
            tv_z.text = "z"
            tv_x.text = "x"
            tv_c.text = "c"
            tv_v.text = "v"
            tv_b.text = "b"
            tv_n.text = "n"
            tv_m.text = "m"

            keyValues.put(R.id.button_z, "z")
            keyValues.put(R.id.button_x, "x")
            keyValues.put(R.id.button_c, "c")
            keyValues.put(R.id.button_v, "v")
            keyValues.put(R.id.button_b, "b")
            keyValues.put(R.id.button_n, "n")
            keyValues.put(R.id.button_m, "m")
        }

        /*Common Keys*/
        /*Row 1*/
        keyValues.put(R.id.button_back_quote, "`")
        keyValues.put(R.id.button_1, "1")
        keyValues.put(R.id.button_2, "2")
        keyValues.put(R.id.button_3, "3")
        keyValues.put(R.id.button_4, "4")
        keyValues.put(R.id.button_5, "5")
        keyValues.put(R.id.button_6, "6")
        keyValues.put(R.id.button_7, "7")
        keyValues.put(R.id.button_8, "8")
        keyValues.put(R.id.button_9, "9")
        keyValues.put(R.id.button_0, "0")
        keyValues.put(R.id.button_minus, "-")
        keyValues.put(R.id.button_plus, "=")

        /*Row 2*/
        keyValues.put(R.id.button_tab, "    ")
        keyValues.put(R.id.button_open_brace, "[")
        keyValues.put(R.id.button_close_brace, "]")
        keyValues.put(R.id.button_backslash, "\\")

        /*Row 3*/
        keyValues.put(R.id.button_colon, ";")
        keyValues.put(R.id.button_quote, "\'")

        /*Row 4*/
        keyValues.put(R.id.button_left_shift, "")     //to be edit
        keyValues.put(R.id.button_open_angle, ",")
        keyValues.put(R.id.button_close_angle, ".")
        keyValues.put(R.id.button_question, "/")
        keyValues.put(R.id.button_right_shift, "")    //to be edit

        /*Row 5*/
        keyValues.put(R.id.button_fun, "")     //to be edit
        keyValues.put(R.id.button_left_ctrl, "")     //to be edit
        keyValues.put(R.id.button_left_Alt, "")     //to be edit
        keyValues.put(R.id.button_space, " ")
        keyValues.put(R.id.button_right_ctrl, "")     //to be edit
        keyValues.put(R.id.button_right_alt, "")     //to be edit
        keyValues.put(R.id.button_left_arrow, "")
        keyValues.put(R.id.button_top_arrow, "")     //to be edit
        keyValues.put(R.id.button_down_arrow, "")     //to be edit
        keyValues.put(R.id.button_right_arrow, "")
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_delete) {
            val selectedText = inputConnection!!.getSelectedText(0)
            if (TextUtils.isEmpty(selectedText)) {
                inputConnection!!.deleteSurroundingText(1, 0)
            } else {
                inputConnection!!.commitText("", 1)
            }
        } else if (v.id == R.id.button_caps) {
            caps = !caps
            setvalues()
        } else if (v.id == R.id.button_enter) {
            //SubmitText()
            Toast.makeText(context, "Code Submitted", Toast.LENGTH_SHORT).show()
        } else if (v.id == R.id.button_right_arrow) {
            inputConnection!!.commitText("", 2)
        } else if (v.id == R.id.button_left_arrow) {
            inputConnection!!.commitText("", -1)
        } else {
            val value = keyValues[v.id]
            inputConnection!!.commitText(value, 1)
        }
    }

    fun setInputConnection(ic: InputConnection?) {
        inputConnection = ic
    }

    init {
        init(context, attrs)
    }

    override fun onLongClick(v: View?): Boolean {

        when (v!!.id) {
            R.id.button_back_quote -> {
                inputConnection!!.commitText("~", 1)
                return true
            }
            R.id.button_1 -> {
                inputConnection!!.commitText("!", 1)
                return true
            }
            R.id.button_2 -> {
                inputConnection!!.commitText("@", 1)
                return true
            }
            R.id.button_3 -> {
                inputConnection!!.commitText("#", 1)
                return true
            }
            R.id.button_4 -> {
                inputConnection!!.commitText("$", 1)
                return true
            }
            R.id.button_5 -> {
                inputConnection!!.commitText("%", 1)
                return true
            }
            R.id.button_6 -> {
                inputConnection!!.commitText("^", 1)
                return true
            }
            R.id.button_7 -> {
                inputConnection!!.commitText("&", 1)
                return true
            }
            R.id.button_8 -> {
                inputConnection!!.commitText("*", 1)
                return true
            }
            R.id.button_9 -> {
                inputConnection!!.commitText("(", 1)
                return true
            }
            R.id.button_0 -> {
                inputConnection!!.commitText(")", 1)
                return true
            }
            R.id.button_minus -> {
                inputConnection!!.commitText("_", 1)
                return true
            }
            R.id.button_plus -> {
                inputConnection!!.commitText("+", 1)
                return true
            }
            R.id.button_open_brace -> {
                inputConnection!!.commitText("{", 1)
                return true
            }
            R.id.button_close_brace -> {
                inputConnection!!.commitText("}", 1)
                return true
            }
            R.id.button_backslash -> {
                inputConnection!!.commitText("\\", 1)
                return true
            }
            R.id.button_colon -> {
                inputConnection!!.commitText(":", 1)
                return true
            }
            R.id.button_quote -> {
                inputConnection!!.commitText("\"", 1)
                return true
            }
            R.id.button_open_angle -> {
                inputConnection!!.commitText("<", 1)
                return true
            }
            R.id.button_close_angle -> {
                inputConnection!!.commitText(">", 1)
                return true
            }
            R.id.button_question -> {
                inputConnection!!.commitText("?", 1)
                return true
            }
        }

        return false
    }
}
